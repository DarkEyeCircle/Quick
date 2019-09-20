package com.askia.android.library.base;


import com.qmuiteam.qmui.widget.QMUITopBar;

public interface IBaseView {
    /**
     * 初始化界面传递参数
     */
    void initParam();
    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化界面观察者的监听
     */
    void initViewObservable();

    /**
     * 初始化界面配置
     */
    AppConfig.Builder initAppConfig();


    /**
     * 配置标题栏
     */
    void configTitleLayout();
}
