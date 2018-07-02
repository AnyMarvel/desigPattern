package jvm.desig.pattern.factory;

public class MessageSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is message sender  ");
    }
}
