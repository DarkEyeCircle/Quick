package com.askia.android.library.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

import me.jessyan.autosize.internal.CustomAdapt;

public abstract class BaseAdapterFragment<V extends ViewDataBinding, VM extends BaseViewModel> extends BaseFragment<V, VM> implements CustomAdapt {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //由于某些原因, 屏幕旋转后 Fragment 的重建, 会导致框架对 Fragment 的自定义适配参数失去效果
        //所以如果您的 Fragment 允许屏幕旋转, 则请在 onCreateView 手动调用一次 AutoSize.autoConvertDensity()
        //如果您的 Fragment 不允许屏幕旋转, 则可以将下面调用 AutoSize.autoConvertDensity() 的代码删除掉
        //AutoSize.autoConvertDensity(getActivity(), 1080, true);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public boolean isBaseOnWidth() {
        return true;
    }

    @Override
    public float getSizeInDp() {
        return 375;
    }

}