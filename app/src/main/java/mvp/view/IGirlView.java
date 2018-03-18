package mvp.view;

import java.util.List;

import mvp.model.Girl;

/**
 * Created by lenovo on 2018/1/23.
 * 定义出所有的UI逻辑
 */

public interface IGirlView {
    void showLoading();
    //显示listview中的数据（使用回调的方式返回数据）
    void showGirls(List<Girl> girls);
}
