package com.askia.app.android;

import android.app.Application;

import androidx.annotation.NonNull;

import com.askia.android.library.base.BaseModel;
import com.askia.android.library.base.BaseViewModel;

public class MainActivityViewModel extends BaseViewModel<BaseModel> {

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }



}
