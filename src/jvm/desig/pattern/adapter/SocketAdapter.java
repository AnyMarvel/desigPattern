package jvm.desig.pattern.adapter;

/**
 * 适配器实现德标接口
 */
public class SocketAdapter implements DBSocketInterface {

    /**
     * 组合新接口
     */
    private GBSocketInterface gbSocket;

    /**
     * 在创建适配器对象时，必须传入一个新接口的实现类
     *
     * @param gbSocket 国标接口
     */
    SocketAdapter(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    /**
     * 将对旧接口的调用适配到新接口
     */
    @Override
    public void powerWithTwoRound() {

        gbSocket.powerWithThreeFlat();
    }

}