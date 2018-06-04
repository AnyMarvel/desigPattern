package jvm.desig.pattern.chainofresponsibility;

/**
 * 责任链测试类
 */
public class ClientTest {

    public static void main(String[] args) {
        //创建处理器
        AbstractHandler handler1 = new Handle1();
        AbstractHandler handler2 = new Handle2();
        //客户端创建处理器的关联，形成链
        handler1.setSuccessor(handler2);
        //创建任务，此处为一些数字，不同大小，处理器处理结果不同
        int[] testNumber = {4, 10, 59, 2, 16};
        //调用处理器处理
        for (int i = 0; i < testNumber.length; i++) {
            handler1.request(testNumber[i]);
        }
    }
}
