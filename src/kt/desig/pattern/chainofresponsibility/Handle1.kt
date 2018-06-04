package kt.desig.pattern.chainofresponsibility

/**
 * 处理器Handle1
 */
class Handle1 : AbstractHandler() {
    override fun request(requestNumber: Int) {
        if (requestNumber < 10) {
            println("我是handler1，我处理了请求：$requestNumber")
        } else {
            this.abstractHandler.request(requestNumber);
        }
    }

}