package com.anlddev.designmode.strategy.pattern;

import android.view.View;

/**
 * 环境角色
 * Created by Administrator on 2017/2/10 0010.
 */

public class Env {

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

    public void currentStrategy(View v) {
        mStrategy.strategy(v);
    }
}
