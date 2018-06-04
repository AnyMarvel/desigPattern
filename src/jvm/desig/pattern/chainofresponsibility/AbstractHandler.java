package jvm.desig.pattern.chainofresponsibility;

/**
 * 责任链接口
 */
public abstract class AbstractHandler {
    AbstractHandler abstractHandler;

    void setSuccessor(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }

    public abstract void request(int requestNumber);
}
