package com.anlddev.designmode.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.anlddev.designmode.R;
import com.anlddev.designmode.strategy.pattern.Env;
import com.anlddev.designmode.strategy.pattern.FirstStrategy;
import com.anlddev.designmode.strategy.pattern.SecondStrategy;
import com.anlddev.designmode.strategy.pattern.Strategy;
import com.anlddev.designmode.strategy.pattern.ThirdStrategy;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 策略模式Demo
 */
public class StrategyActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.rg_strategy_select)
    protected RadioGroup rgStrategySelect;
    @BindView(R.id.tv_strategy_result)
    protected TextView tvResult;

    //策略一
    private Strategy mStrategy1 = new FirstStrategy();
    //策略二
    private Strategy mStrategy2 = new SecondStrategy();
    //策略三
    private Strategy mStrategy3 = new ThirdStrategy();
    //策略环境角色
    private Env mEnv = new Env(mStrategy1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);

        rgStrategySelect.setOnCheckedChangeListener(this);
    }

    public void btnStrategyInvokeOnClick(View v) {
        //最终执行
        mEnv.currentStrategy(tvResult);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //策略选择
        switch (checkedId) {
            case R.id.rb_strategy_1:
                mEnv.setmStrategy(mStrategy1);
                break;
            case R.id.rb_strategy_2:
                mEnv.setmStrategy(mStrategy2);
                break;
            case R.id.rb_strategy_3:
                mEnv.setmStrategy(mStrategy3);
                break;
            default:
                break;
        }
    }
}
