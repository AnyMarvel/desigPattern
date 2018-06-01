package kt.desig.pattern.observer

/**
 * 定义被观察者,实现了Observerable接口,对Observerable中的三个方法进行具体的实现
 */
class WatchServer internal constructor() : Observerable {

    private val observers: MutableList<Observer>
    private var message: String = "默认消息样本"

    init {
        observers = ArrayList()
    }

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(message)
        }
    }

    internal fun setInfomation(message: String) {
        this.message = message
        println("服务端更新消息:$message")
        notifyObservers()

    }
}
