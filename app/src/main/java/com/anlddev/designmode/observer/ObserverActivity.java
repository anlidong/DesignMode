package com.anlddev.designmode.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.anlddev.designmode.R;
import com.anlddev.designmode.observer.pattern.Observable;
import com.anlddev.designmode.observer.pattern.Observer;
import com.anlddev.designmode.observer.pattern.TimeObservable;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ObserverActivity extends AppCompatActivity {

    private TimeObservable mObservable;
    private Observer mObserverA, mObserverB, mObserverC;

    @BindView(R.id.tv_observer_state_a)
    protected TextView tvObserverA;
    @BindView(R.id.tv_observer_state_b)
    protected TextView tvObserverB;
    @BindView(R.id.tv_observer_state_c)
    protected TextView tvObserverC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);

        initValue();
    }

    private void initValue() {
        mObservable = new TimeObservable();
        mObserverA = new TimeWatcher(tvObserverA);
        mObserverB = new TimeWatcher(tvObserverB);
        mObserverC = new TimeWatcher(tvObserverC);
    }

    public void btnUpdateState(View v) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        mObservable.setData(sdf.format(new Date(System.currentTimeMillis())));
    }

    public void btnAddObserverA(View v) {
        mObservable.addObserver(mObserverA);
    }

    public void btnAddObserverB(View v) {
        mObservable.addObserver(mObserverB);
    }

    public void btnAddObserverC(View v) {
        mObservable.addObserver(mObserverC);
    }

    /**
     * 具体观察者对象
     */
    static class TimeWatcher implements Observer {

        private TextView textView;

        public TimeWatcher(TextView textView) {
            this.textView = textView;
        }

        @Override
        public void update(Observable observable) {
            if(observable instanceof TimeObservable) {
                this.textView.setText(((TimeObservable) observable).getData());
            }
        }
    }
}
