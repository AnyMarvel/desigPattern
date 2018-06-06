package kt.desig.pattern.visitor

/**
 * 访问者接口
 */
interface AccountBookView {
    fun view(consumerBill: ConsumerBill)

    fun view(incomeBill: IncomeBill)
}
