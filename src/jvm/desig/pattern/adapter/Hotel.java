package jvm.desig.pattern.adapter;

/**
 * 德国宾馆
 */
class Hotel {

    /**
     * 旅馆中有一个德标的插口
     */

    private DBSocketInterface dbSocket;

    /**
     * 德国宾馆设置
     *
     * @param dbSocket
     */
    void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    /**
     * 旅馆中有一个充电的功能
     */
    void charge() {

        //使用德标插口充电
        dbSocket.powerWithTwoRound();
    }
}