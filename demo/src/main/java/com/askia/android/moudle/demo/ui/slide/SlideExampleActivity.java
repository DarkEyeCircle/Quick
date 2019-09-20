package com.askia.android.moudle.demo.ui.slide;

import android.os.Bundle;

import com.askia.android.library.base.BaseActivity;
import com.askia.android.library.base.BaseViewModel;
import com.askia.android.moudle.demo.BR;
import com.askia.android.moudle.demo.R;
import com.askia.android.moudle.demo.databinding.DemoActivitySlideBinding;

public class SlideExampleActivity extends BaseActivity<DemoActivitySlideBinding, BaseViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.demo_activity_slide;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public BaseViewModel initViewModel() {
        return super.initViewModel();
    }
}