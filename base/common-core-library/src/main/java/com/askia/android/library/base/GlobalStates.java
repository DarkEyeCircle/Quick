package com.askia.android.library.base;

/**
 * 信息存储
 */
public class GlobalStates {

    private static AppConfig config;

    public static AppConfig getConfig() {
        return config;
    }

    public static void setConfig(AppConfig config) {
        GlobalStates.config = config;
    }
}
