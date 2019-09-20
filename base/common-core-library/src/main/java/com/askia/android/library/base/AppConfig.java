package com.askia.android.library.base;

import androidx.annotation.NonNull;

/**
 * 全局配置
 */
public class AppConfig {

    /**
     * 是否开启activity侧滑
     *
     * @return true;开启滑动 false:关闭滑动
     */
    private boolean openSlide = false;

    /**
     * 是否开启沉浸式状态栏
     *
     * @return true;开启 false:关闭
     */
    private boolean openImmersionBar = false;

    public boolean isOpenSlide() {
        return openSlide;
    }

    public void setOpenSlide(boolean openSlide) {
        this.openSlide = openSlide;
    }

    public boolean isOpenImmersionBar() {
        return openImmersionBar;
    }

    public void setOpenImmersionBar(boolean openImmersionBar) {
        this.openImmersionBar = openImmersionBar;
    }

    public static class Builder {

        private AppConfig config;

        @NonNull
        public static Builder create() {
            Builder builder = new Builder();
            builder.config = new AppConfig();
            return builder;
        }

        @NonNull
        public Builder openSlide(boolean openSlide) {
            config.openSlide = openSlide;
            return this;
        }

        @NonNull
        public Builder openImmersionBar(boolean openImmersionBar) {
            config.openImmersionBar = openImmersionBar;
            return this;
        }

        @NonNull
        public AppConfig getConfig() {
            return config;
        }

        public void apply() {
            GlobalStates.setConfig(config);
        }
    }

}
