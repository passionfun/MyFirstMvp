package com.passionfun.testmvp.mvp.presenter;

import android.os.Handler;

import com.passionfun.testmvp.mvp.bean.User;
import com.passionfun.testmvp.mvp.biz.IUserBiz;
import com.passionfun.testmvp.mvp.biz.OnLoginListener;
import com.passionfun.testmvp.mvp.biz.UserBiz;
import com.passionfun.testmvp.mvp.view.IUserLoginView;

/**
 * Created by lenovo on 2018/1/8.
 */

public class UserLoginPresenter {
    private IUserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler mHandler = new Handler();
    public UserLoginPresenter(IUserLoginView userLoginView){
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz();
    }
    public void loginSuccessPresenter(){
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.hideLoading();
                        userLoginView.toMainActivity(user);
                    }
                });
            }

            @Override
            public void loginFail() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.loginError();
                        userLoginView.hideLoading();
                    }
                });
            }
        });
    }
    public void clear(){
        userLoginView.clearUserName();
        userLoginView.clearPassword();
    }
}
