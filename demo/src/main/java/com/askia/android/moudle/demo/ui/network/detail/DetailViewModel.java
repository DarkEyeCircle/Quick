package com.askia.android.moudle.demo.ui.network.detail;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.askia.android.library.base.BaseViewModel;
import com.askia.android.moudle.demo.entity.DemoEntity;


public class DetailViewModel extends BaseViewModel {
    public ObservableField<DemoEntity.ItemsEntity> entity = new ObservableField<>();

    public DetailViewModel(@NonNull Application application) {
        super(application);
    }

    public void setDemoEntity(DemoEntity.ItemsEntity entity) {
        this.entity.set(entity);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        entity = null;
    }
}
