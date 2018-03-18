package com.passionfun.testmvp.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.passionfun.testmvp.mvp.presenter.BasePresenter;

/**
 * Created by lenovo on 2018/1/23.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity{
    //表示层的引用
    public T girlPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girlPresenter = createPresenter();
        girlPresenter.attachView((V)this);
    }
    protected abstract T createPresenter();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.detachView();
    }
}
