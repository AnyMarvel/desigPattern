package kt.desig.pattern.chainofresponsibility

/**
 * 责任链测试类
 */
object ClientTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val handle1 = Handle1()
        val handle2 = Handle2()
        handle1.setSuccessor(handle2)
        //创建任务，此处为一些数字，不同大小，处理器处理结果不同
        val testNumber = intArrayOf(4, 10, 59, 2, 16)
        for (i in testNumber.indices) {
            handle1.request(testNumber[i])
        }
    }
}