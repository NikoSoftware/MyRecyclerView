package com.niko.myrecyclerview;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Niko on2016/4/27.
 */
public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setView());
        init();
    }


    public abstract  int setView();
    public abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
