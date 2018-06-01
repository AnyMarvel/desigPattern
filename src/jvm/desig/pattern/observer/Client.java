package jvm.desig.pattern.observer;

/**
 * 观察者
 * 实现了update方法
 */
public class Client implements Observer {
    private String name;
    private String message;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}