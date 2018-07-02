package jvm.desig.pattern.factory;

public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceMessage() {
        return new MessageSender();
    }

}
