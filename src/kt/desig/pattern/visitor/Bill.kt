package kt.desig.pattern.visitor

/**
 * 创建一个账单接口，有接收访问者的功能
 */
interface Bill {
    fun accept(accountBookView: AccountBookView)
}
