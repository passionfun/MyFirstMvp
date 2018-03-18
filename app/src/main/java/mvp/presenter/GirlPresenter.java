package mvp.presenter;

import com.passionfun.testmvp.mvp.presenter.BasePresenter;

import java.util.List;

import mvp.model.Girl;
import mvp.model.GirlModelImpl;
import mvp.model.IGirlModel;
import mvp.view.IGirlView;

/**
 * Created by lenovo on 2018/1/23.
 * 表示层
 */

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {
    //1、view层的引用
//    IGirlView girlView;
    //1、使用弱引用，防止内存泄漏
//    WeakReference<T> mWeakRef;

    //2、model层的引用
    IGirlModel girlModel = new GirlModelImpl();
    //3、构造方法

//    public GirlPresenter(T girlView) {
////        this.girlView = girlView;
//        mWeakRef = new WeakReference<T>(girlView);
//
//    }
    public GirlPresenter() {

    }
//    //进行绑定
//    public void attachView(T view){
//        mWeakRef = new WeakReference<T>(view);
//    }
//    //接触绑定
//    public void detachView(){
//        mWeakRef.clear();
//    }
    //4、执行操作(UI逻辑)
    public void fetch(){
//        if(girlView != null){
//            girlView.showLoading();
        if(mWeakRef.get() != null){
            mWeakRef.get().showLoading();
            if(girlModel != null){
                girlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
//                        if(girlView != null){
//                            girlView.showGirls(girls);
//                        }
                        if(mWeakRef.get() != null){
                            mWeakRef.get().showGirls(girls);
                        }
                    }
                });
            }
        }
    }
}
