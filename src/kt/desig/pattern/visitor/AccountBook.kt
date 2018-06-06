package kt.desig.pattern.visitor


import java.util.ArrayList

/**
 * 账单类：用于添加账单，和为每一个账单添加访问者
 */
internal class AccountBook {
    private val listBill = ArrayList<Bill>()

    // 添加单子
    fun add(bill: Bill) {
        listBill.add(bill)
    }

    // 为每个账单添加访问者
    fun show(viewer: AccountBookView) {
        for (b in listBill) {
            b.accept(viewer)
        }
    }
}
