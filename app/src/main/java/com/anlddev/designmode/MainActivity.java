package com.anlddev.designmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.anlddev.designmode.observer.ObserverActivity;
import com.anlddev.designmode.strategy.StrategyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 策略模式
     * @param v
     */
    public void btnStrategyOnClick(View v) {
        Intent intent = new Intent(this, StrategyActivity.class);
        startActivity(intent);
    }

    /**
     * 观察者模式
     * @param v
     */
    public void btnObserverOnClick(View v) {
        Intent intent = new Intent(this, ObserverActivity.class);
        startActivity(intent);
    }
}
