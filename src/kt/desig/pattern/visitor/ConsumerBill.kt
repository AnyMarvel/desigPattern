package kt.desig.pattern.visitor

/**
 * 消费单子
 */
class ConsumerBill : Bill {
    internal var item: String = ""
    internal var amount: Double = 0.0

    internal constructor(item: String, amount: Double) {
        this.amount = amount
        this.item = item
    }

    fun getItem(): String {
        return item
    }

    fun getAmount(): Double {
        return amount
    }

    override fun accept(accountBookView: AccountBookView) {
        accountBookView.view(this)
    }
}
