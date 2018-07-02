package jvm.desig.pattern.factory;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produceMail();
        sender.sender();


        SendFactory sendFactory2 = new SendFactory();
        Sender sender2 = sendFactory2.produceMessage();
        sender2.sender();

    }
}
