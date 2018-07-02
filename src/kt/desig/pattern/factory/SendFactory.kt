package kt.desig.pattern.factory

class SendFactory {
    fun produceMail(): Sender {
        return MailSender()
    }

    fun produceMessage(): Sender {
        return MessageSender()
    }
}