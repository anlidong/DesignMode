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

public class StrategyActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.rg_strategy_select)
    protected RadioGroup rgStrategySelect;
    @BindView(R.id.tv_strategy_result)
    protected TextView tvResult;

    private Strategy mStrategy1 = new FirstStrategy();
    private Strategy mStrategy2 = new SecondStrategy();
    private Strategy mStrategy3 = new ThirdStrategy();
    private Env mEnv = new Env(mStrategy1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);

        rgStrategySelect.setOnCheckedChangeListener(this);
    }

    public void btnStrategyInvokeOnClick(View v) {
        mEnv.currentStrategy(tvResult);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
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
