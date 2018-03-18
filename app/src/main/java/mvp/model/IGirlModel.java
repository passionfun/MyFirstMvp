package mvp.model;

import java.util.List;

/**
 * Created by lenovo on 2018/1/23.
 * 用来加载数据
 */

public interface IGirlModel {
    void loadGirl(GirlOnLoadListener listener);
    //设计一个内部接口
    interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
