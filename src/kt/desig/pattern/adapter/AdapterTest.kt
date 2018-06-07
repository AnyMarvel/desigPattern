package kt.desig.pattern.adapter

object AdapterTest {
    @JvmStatic
    fun main(args: Array<String>) {
        /**
         * 初始化一个中国插座对象， 用一个国标接口引用它
         */
        val gbSocket = GBSocket()
        /**
         * 创建一个旅馆对象
         */
        val hotel = Hotel()
        /**
         * 创建适配器,使国标接口适配国标接口
         */
        val socketAdapter = SocketAdapter(gbSocket)

        /**
         * 设置插座
         */
        hotel.setDbSocket(socketAdapter)
        /**
         * 在旅馆中给手机充电
         */
        hotel.charge()
    }

}
