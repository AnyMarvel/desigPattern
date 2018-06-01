package jvm.desig.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义被观察者,实现了Observerable接口,对Observerable中的三个方法进行具体的实现
 */
public class WatchServer implements Observerable {
    private List<Observer> observers;
    private String message;

    WatchServer() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    void setInfomation(String message) {
        this.message = message;
        System.out.println("服务端更新消息:" + message);
        notifyObservers();

    }
}
