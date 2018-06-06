package kt.desig.pattern.visitor

/**
 * 会计类：访问者是会计，主要记录每笔单子
 */
class CPA : AccountBookView {
    private var count = 0

    // 查看消费的单子
    override fun view(consumerBill: ConsumerBill) {
        count++
        if (consumerBill.getItem() == "消费") {
            println("第" + count + "个单子消费了：" + consumerBill.getAmount())
        }
    }

    // 查看收入单子
    override fun view(incomeBill: IncomeBill) {

        if (incomeBill.getItem() == "收入") {
            println("第" + count + "个单子收入了：" + incomeBill.getAmount())
        }
    }
}
