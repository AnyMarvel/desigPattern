package jvm.desig.pattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        /**
         * 初始化一个中国插座对象， 用一个国标接口引用它
         */
        GBSocketInterface gbSocket = new GBSocket();
        /**
         * 创建一个旅馆对象
         */
        Hotel hotel = new Hotel();
        /**
         * 创建适配器,使国标接口适配国标接口
         */
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        /**
         * 设置插座
         */
        hotel.setDbSocket(socketAdapter);
        /**
         * 在旅馆中给手机充电
         */
        hotel.charge();

    }

}
