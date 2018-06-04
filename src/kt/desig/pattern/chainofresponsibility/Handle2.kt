package kt.desig.pattern.chainofresponsibility

/**
 * 处理器Handle2
 */
class Handle2 : AbstractHandler() {
    override fun request(requestNumber: Int) {
        if (requestNumber > 10) {
            println("我是handler2，我处理了请求：$requestNumber")
        } else {
            println("请求 $requestNumber 没人能处理")
        }
    }
}