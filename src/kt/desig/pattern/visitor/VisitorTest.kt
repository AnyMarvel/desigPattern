package kt.desig.pattern.visitor

object VisitorTest {
    @JvmStatic
    fun main(args: Array<String>) {
        // 创建消费和收入单子
        val consumerBill = ConsumerBill("消费", 3000.0)
        val incomeBill = IncomeBill("收入", 5000.0)
        val consumerBill2 = ConsumerBill("消费", 4000.0)
        val incomeBill2 = IncomeBill("收入", 8000.0)
        // 添加单子
        val accountBook = AccountBook()
        accountBook.add(consumerBill)
        accountBook.add(incomeBill)
        accountBook.add(consumerBill2)
        accountBook.add(incomeBill2)
        // 创建访问者
        val boss = Boss()
        val cpa = CPA()
//
//        // 接受 访问者
        accountBook.show(boss)
        accountBook.show(cpa)
//        // boss查看总收入和总消费
        boss.getTotalConsumer()
        boss.getTotalIncome()
    }
}
