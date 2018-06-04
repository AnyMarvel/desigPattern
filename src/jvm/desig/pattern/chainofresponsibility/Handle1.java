package jvm.desig.pattern.chainofresponsibility;

/**
 * 处理器handle1
 */
public class Handle1 extends AbstractHandler {
    @Override
    public void request(int requestNumber) {
        if (requestNumber < 10) {
            System.out.println("我是handler1，我处理了请求：" + requestNumber);
        } else {
            this.abstractHandler.request(requestNumber);
        }
    }
}
