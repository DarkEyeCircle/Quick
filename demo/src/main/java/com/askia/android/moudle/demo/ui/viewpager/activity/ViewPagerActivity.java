package com.askia.android.moudle.demo.ui.viewpager.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;

import com.askia.android.library.base.BaseActivity;
import com.askia.android.library.databinding.TitleLayoutBinding;
import com.askia.android.library.utils.ToastUtils;
import com.askia.android.moudle.demo.BR;
import com.askia.android.moudle.demo.R;
import com.askia.android.moudle.demo.databinding.FragmentViewpagerBinding;
import com.askia.android.moudle.demo.ui.viewpager.adapter.ViewPagerBindingAdapter;
import com.askia.android.moudle.demo.ui.viewpager.vm.ViewPagerViewModel;
import com.google.android.material.tabs.TabLayout;

/**
 * ViewPager绑定的例子, 更多绑定方式，请参考 https://github.com/evant/binding-collection-adapter
 * 所有例子仅做参考,千万不要把它当成一种标准,毕竟主打的不是例子,业务场景繁多,理解如何使用才最重要。
 */

public class ViewPagerActivity extends BaseActivity<FragmentViewpagerBinding, ViewPagerViewModel> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.fragment_viewpager;
    }

    @Override
    public TitleLayoutBinding initTitleView(FragmentViewpagerBinding binding) {
        return null;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
        //给ViewPager设置adapter
        binding.setAdapter(new ViewPagerBindingAdapter());
    }

    @Override
    public void initViewObservable() {
        viewModel.itemClickEvent.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String text) {
                ToastUtils.showShort("position：" + text);
            }
        });
    }
}
