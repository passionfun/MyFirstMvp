package com.passionfun.testmvp.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by lenovo on 2018/1/23.
 */

public class BasePresenter<T> {
    //1、view的引用
    protected WeakReference<T> mWeakRef;
    //进行绑定
    public void attachView(T view){
        mWeakRef = new WeakReference<T>(view);
    }
    //解除绑定
    public void detachView(){
        mWeakRef.clear();
    }
}
