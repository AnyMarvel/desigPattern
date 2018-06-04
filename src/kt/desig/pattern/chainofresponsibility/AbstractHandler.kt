package kt.desig.pattern.chainofresponsibility

/**
 * 责任链接口
 */
abstract class AbstractHandler {
    lateinit var abstractHandler: AbstractHandler
    internal fun setSuccessor(abstractHandler: AbstractHandler) {
        this.abstractHandler = abstractHandler
    }
    abstract fun request(requestNumber: Int)
}