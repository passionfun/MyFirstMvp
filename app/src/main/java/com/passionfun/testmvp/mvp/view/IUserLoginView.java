package com.passionfun.testmvp.mvp.view;

import com.passionfun.testmvp.mvp.bean.User;

/**
 * Created by lenovo on 2018/1/8.
 */

public interface IUserLoginView {
    String getUserName();
    String getPassword();
    void showLoading();
    void hideLoading();
    void toMainActivity(User user);
    void loginError();
    void clearUserName();
    void clearPassword();
}
