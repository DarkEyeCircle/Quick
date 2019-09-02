package com.askia.android.moudle.demo.ui.rv_multi;

import androidx.annotation.NonNull;

import com.askia.android.library.base.BaseViewModel;
import com.askia.android.library.base.MultiItemViewModel;
import com.askia.android.library.ui.binding.command.BindingAction;
import com.askia.android.library.ui.binding.command.BindingCommand;
import com.askia.android.library.utils.ToastUtils;

public class MultiRecycleHeadViewModel extends MultiItemViewModel {

    public MultiRecycleHeadViewModel(@NonNull BaseViewModel viewModel) {
        super(viewModel);
    }

    //条目的点击事件
    public BindingCommand itemClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ToastUtils.showShort("我是头布局");
        }
    });
}
