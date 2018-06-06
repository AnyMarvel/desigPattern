package jvm.desig.pattern.visitor;

/**
 * 收入账单
 */
public class IncomeBill implements Bill {
    private String item;
    private double amount;

    String getItem() {
        return item;
    }

    double getAmount() {
        return amount;
    }

    IncomeBill(String item, double amount) {

        this.item = item;
        this.amount = amount;
    }

    @Override
    public void accept(AccountBookView accountBookView) {
        accountBookView.view(this);
    }
}
