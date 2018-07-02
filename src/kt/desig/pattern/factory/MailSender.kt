package kt.desig.pattern.factory

class MailSender : Sender {
    override fun send() {
        println("send a mail")
    }
}