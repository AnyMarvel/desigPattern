package kt.desig.pattern.observer

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 */
interface Observerable {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}