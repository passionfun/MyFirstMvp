package com.passionfun.testmvp.mvp.biz;

/**
 * Created by lenovo on 2018/1/8.
 */

public interface IUserBiz {
    void login(String userName, String password, OnLoginListener listener);
}
