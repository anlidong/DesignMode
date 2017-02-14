package com.anlddev.designmode.observer.pattern;

/**
 * 具体被观察者对象
 * Created by Administrator on 2017/2/14 0014.
 */

public class TimeObservable extends Observable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }
}
