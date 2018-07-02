package kt.desig.pattern.factory

class MessageSender : Sender {
    override fun send() {
        println("send message")
    }
}