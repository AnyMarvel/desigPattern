package kt.desig.pattern.visitor

/**
 * 支出单子
 */
class IncomeBill : Bill {
    private var item: String = ""
    internal var amount: Double = 0.0

    internal constructor(item: String, amount: Double) {
        this.item = item
        this.amount = amount
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
