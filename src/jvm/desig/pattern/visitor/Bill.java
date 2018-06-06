package jvm.desig.pattern.visitor;

/**
 * 创建一个账单接口，有接收访问者的功能
 */
public interface Bill {
    void accept(AccountBookView accountBookView);
}
