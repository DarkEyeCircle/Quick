package com.askia.android.moudle.demo.ui.tab_bar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import androidx.annotation.Nullable;

import com.askia.android.library.base.BaseFragment;
import com.askia.android.moudle.demo.BR;
import com.askia.android.moudle.demo.R;


public class TabBar4Fragment extends BaseFragment {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_tab_bar_4;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
