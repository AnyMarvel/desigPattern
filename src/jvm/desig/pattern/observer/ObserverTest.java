package jvm.desig.pattern.observer;

public class ObserverTest {
    public static void main(String[] args) {
        //实例化被观察者
        WatchServer watchServer = new WatchServer();
        //新建三个用户
        Client zhangsan = new Client("张三");
        Client lisi = new Client("李四");
        Client wangwu = new Client("王五");
        //将新用户注册到到被观察者服务中
        watchServer.registerObserver(zhangsan);
        watchServer.registerObserver(lisi);
        watchServer.registerObserver(wangwu);
        //服务端发送消息
        watchServer.setInfomation("hello world");
        System.out.println("--------张三注销注册-----------");
        watchServer.removeObserver(zhangsan);
        watchServer.setInfomation("Observer Pattern");
    }
}
