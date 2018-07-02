package kt.desig.pattern.factory

object FatoryTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val factory = SendFactory()
        val sender1 = factory.produceMail()
        val sender2 = factory.produceMessage()
        sender1.send()
        sender2.send()

    }
}