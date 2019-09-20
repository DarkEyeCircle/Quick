package com.askia.android.library.base;


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
}
