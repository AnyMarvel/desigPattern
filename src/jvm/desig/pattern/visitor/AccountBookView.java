package jvm.desig.pattern.visitor;

/**
 * 访问者接口
 */
public interface AccountBookView {
    void view(ConsumerBill consumerBill);

    void view(IncomeBill incomeBill);
}
