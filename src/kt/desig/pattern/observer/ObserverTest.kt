package kt.desig.pattern.observer

/**
 * 测试类
 */
object ObserverTest {
    @JvmStatic
    fun main(args: Array<String>) {
        //实例化被观察者
        val watchServer = WatchServer()
        //新建三个用户
        val zhangsan = Client("张三")
        val lisi = Client("李四")
        val wangwu = Client("王五")
        //将新用户注册到到被观察者服务中
        watchServer.registerObserver(zhangsan)
        watchServer.registerObserver(lisi)
        watchServer.registerObserver(wangwu)
        //服务端发送消息
        watchServer.setInfomation("hello world")
        println("--------张三注销注册-----------")
        watchServer.removeObserver(zhangsan)
        watchServer.setInfomation("Observer Pattern")
    }
}