package com.passionfun.testmvp.mvp.biz;

import com.passionfun.testmvp.mvp.bean.User;

/**
 * Created by lenovo on 2018/1/8.
 */

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFail();
}
