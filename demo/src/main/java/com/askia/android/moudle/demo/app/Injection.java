package com.askia.android.moudle.demo.app;


import com.askia.android.moudle.demo.data.DemoRepository;
import com.askia.android.moudle.demo.data.source.HttpDataSource;
import com.askia.android.moudle.demo.data.source.LocalDataSource;
import com.askia.android.moudle.demo.data.source.http.HttpDataSourceImpl;
import com.askia.android.moudle.demo.data.source.http.service.DemoApiService;
import com.askia.android.moudle.demo.data.source.local.LocalDataSourceImpl;
import com.askia.android.moudle.demo.utils.RetrofitClient;

/**
 * 注入全局的数据仓库，可以考虑使用Dagger2。（根据项目实际情况搭建，千万不要为了架构而架构）
 */
public class Injection {
    public static DemoRepository provideDemoRepository() {
        //网络API服务
        DemoApiService apiService = RetrofitClient.getInstance().create(DemoApiService.class);
        //网络数据源
        HttpDataSource httpDataSource = HttpDataSourceImpl.getInstance(apiService);
        //本地数据源
        LocalDataSource localDataSource = LocalDataSourceImpl.getInstance();
        //两条分支组成一个数据仓库
        return DemoRepository.getInstance(httpDataSource, localDataSource);
    }
}
