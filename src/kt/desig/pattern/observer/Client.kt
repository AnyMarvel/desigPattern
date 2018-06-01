package kt.desig.pattern.observer

/**
 * 观察者
 * 实现了update方法
 */
class Client internal constructor(private val name: String) : Observer {
    private var message: String? = null

    override fun update(message: String) {
        this.message = message
        read()
    }

    private fun read() {
        println("$name 收到推送消息： $message")
    }
}