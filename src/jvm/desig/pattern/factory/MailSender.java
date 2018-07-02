package jvm.desig.pattern.factory;

public class MailSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is mail Sender");
    }
}
