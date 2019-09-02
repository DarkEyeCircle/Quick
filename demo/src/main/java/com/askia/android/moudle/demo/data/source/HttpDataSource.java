package com.askia.android.moudle.demo.data.source;

import com.askia.android.library.net.http.BaseResponse;
import com.askia.android.moudle.demo.entity.DemoEntity;

import io.reactivex.Observable;

public interface HttpDataSource {
    //模拟登录
    Observable<Object> login();

    //模拟上拉加载
    Observable<DemoEntity> loadMore();

    Observable<BaseResponse<DemoEntity>> demoGet();

    Observable<BaseResponse<DemoEntity>> demoPost(String catalog);


}
