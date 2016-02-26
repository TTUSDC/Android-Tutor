package com.sdc.android.tutor;

import android.os.Bundle;

import com.sdc.android.tutor.base.BaseActivity;

/**
 *  Main activity that is loaded upon application startup.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
