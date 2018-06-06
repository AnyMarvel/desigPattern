package kt.desig.pattern.visitor

/**
 * 老板类：访问者是老板，主要查看总支出和总收入
 */
class Boss : AccountBookView {
    private var totalConsumer: Double = 0.toDouble()
    private var totalIncome: Double = 0.toDouble()

    // 查看消费的单子
    override fun view(consumerBill: ConsumerBill) {
        totalConsumer += consumerBill.amount
    }

    // 查看收入单子
    override fun view(incomeBill: IncomeBill) {
        totalIncome += incomeBill.amount
    }

    internal fun getTotalConsumer() {
        println("老板查看到 一共消费了$totalConsumer")
    }

    internal fun getTotalIncome() {
        println("老板查看到 一共收入了$totalIncome")
    }

}
