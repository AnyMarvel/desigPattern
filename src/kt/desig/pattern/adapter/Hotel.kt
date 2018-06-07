package kt.desig.pattern.adapter

/**
 * 德国宾馆
 */
internal class Hotel {

    /**
     * 旅馆中有一个德标的插口
     */

    private var dbSocket: DBSocketInterface? = null

    /**
     * 德国宾馆设置
     *
     * @param dbSocket
     */
    fun setDbSocket(dbSocket: DBSocketInterface) {
        this.dbSocket = dbSocket
    }

    /**
     * 旅馆中有一个充电的功能
     */
    fun charge() {

        //使用德标插口充电
        dbSocket!!.powerWithTwoRound()
    }
}