package jvm.desig.pattern.chainofresponsibility;

/**
 * 处理器handle2
 */

public class Handle2 extends AbstractHandler {
    @Override
    public void request(int requestNumber) {
        if (requestNumber > 10) {
            System.out.println("我是handler2，我处理了请求：" + requestNumber);
        } else {
            System.out.println("请求" + requestNumber + "没人能处理");
        }
    }
}
