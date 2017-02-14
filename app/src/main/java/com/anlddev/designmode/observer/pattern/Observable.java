package com.anlddev.designmode.observer.pattern;

import java.util.ArrayList;

/**
 * 抽象被观察者
 * Created by Administrator on 2017/2/14 0014.
 */

public abstract class Observable {
    private ArrayList<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    /**
     * 添加一个观察者对象
     * @param o
     */
    public void addObserver(Observer o) {
        if(!observers.contains(o))
            observers.add(o);
    }

    /**
     * 移除一个观察者对象
     * @param o
     */
    public void removeObserver(Observer o) {
        if(observers.contains(o))
            observers.remove(o);
    }

    /**
     * 发送更新状态通知
     */
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
}
