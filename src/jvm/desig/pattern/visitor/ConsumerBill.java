package jvm.desig.pattern.visitor;

/**
 * 支出账单
 */
public class ConsumerBill implements Bill {
    private String item;
    private double amount;

    ConsumerBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void accept(AccountBookView accountBookView) {
        accountBookView.view(this);
    }

    String getItem() {
        return item;
    }

    double getAmount() {
        return amount;
    }
}
