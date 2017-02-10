package com.anlddev.designmode.strategy.pattern;

import android.view.View;
import android.widget.TextView;

/**
 * 具体策略
 * Created by Administrator on 2017/2/10 0010.
 */

public class ThirdStrategy implements Strategy {
    @Override
    public void strategy(View v) {
        if(v instanceof TextView) {
            ((TextView) v).setText("This is the third strategy!");
        }
    }
}
