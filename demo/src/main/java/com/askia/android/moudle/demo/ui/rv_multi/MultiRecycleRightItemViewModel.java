package com.askia.android.moudle.demo.ui.rv_multi;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.askia.android.library.base.MultiItemViewModel;
import com.askia.android.library.ui.binding.command.BindingAction;
import com.askia.android.library.ui.binding.command.BindingCommand;
import com.askia.android.library.utils.ToastUtils;

public class MultiRecycleRightItemViewModel extends MultiItemViewModel<MultiRecycleViewModel> {
    public ObservableField<String> text = new ObservableField<>("");

    public MultiRecycleRightItemViewModel(@NonNull MultiRecycleViewModel viewModel, String text) {
        super(viewModel);
        this.text.set(text);
    }

    //条目的点击事件
    public BindingCommand itemClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //拿到position
            int position = viewModel.observableList.indexOf(MultiRecycleRightItemViewModel.this);
            ToastUtils.showShort("position：" + position);
        }
    });
}
