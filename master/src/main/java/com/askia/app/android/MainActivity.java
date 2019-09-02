package com.askia.app.android;

import android.os.Bundle;

import com.askia.android.library.base.BaseActivity;
import com.askia.app.android.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainActivityViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

}
