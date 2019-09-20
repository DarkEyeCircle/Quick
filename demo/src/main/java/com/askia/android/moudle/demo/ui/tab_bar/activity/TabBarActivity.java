package com.askia.android.moudle.demo.ui.tab_bar.activity;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.askia.android.library.base.BaseActivity;
import com.askia.android.library.base.BaseViewModel;
import com.askia.android.library.databinding.TitleLayoutBinding;
import com.askia.android.moudle.demo.BR;
import com.askia.android.moudle.demo.R;
import com.askia.android.moudle.demo.databinding.ActivityTabBarBinding;
import com.askia.android.moudle.demo.ui.tab_bar.fragment.TabBar1Fragment;
import com.askia.android.moudle.demo.ui.tab_bar.fragment.TabBar2Fragment;
import com.askia.android.moudle.demo.ui.tab_bar.fragment.TabBar3Fragment;
import com.askia.android.moudle.demo.ui.tab_bar.fragment.TabBar4Fragment;

import java.util.ArrayList;
import java.util.List;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

/**
 * 底部tab按钮的例子
 * 所有例子仅做参考,理解如何使用才最重要。
 */

public class TabBarActivity extends BaseActivity<ActivityTabBarBinding, BaseViewModel> {
    private List<Fragment> mFragments;

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_tab_bar;
    }

    @Override
    public TitleLayoutBinding initTitleView(ActivityTabBarBinding binding) {
        return null;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        //初始化Fragment
        initFragment();
        //初始化底部Button
        initBottomTab();
    }

    private void initFragment() {
        mFragments = new ArrayList<>();
        mFragments.add(new TabBar1Fragment());
        mFragments.add(new TabBar2Fragment());
        mFragments.add(new TabBar3Fragment());
        mFragments.add(new TabBar4Fragment());
        //默认选中第一个
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout, mFragments.get(0));
        transaction.commitAllowingStateLoss();
    }

    private void initBottomTab() {
        NavigationController navigationController = binding.pagerBottomTab.material()
                .addItem(R.mipmap.yingyong, "应用")
                .addItem(R.mipmap.huanzhe, "工作")
                .addItem(R.mipmap.xiaoxi_select, "消息")
                .addItem(R.mipmap.wode_select, "我的")
                .setDefaultColor(ContextCompat.getColor(this, R.color.textColorVice))
                .build();
        //底部按钮的点击事件监听
        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, mFragments.get(index));
                transaction.commitAllowingStateLoss();
            }

            @Override
            public void onRepeat(int index) {
            }
        });
    }
}
