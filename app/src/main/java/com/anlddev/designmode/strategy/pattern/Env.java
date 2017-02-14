package com.anlddev.designmode.strategy.pattern;

import android.view.View;

/**
 * 环境角色
 * Created by Administrator on 2017/2/10 0010.
 */

public class Env {

    /**
     * 策略实例
     */
    private Strategy mStrategy;

    public Env(Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public Strategy getmStrategy() {
        return mStrategy;
    }

    public void setmStrategy(Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    /**
     * 统一执行方法
     * @param v
     */
    public void currentStrategy(View v) {
        mStrategy.strategy(v);
    }
}
