package com.passionfun.testmvp.mvp.biz;

import com.passionfun.testmvp.mvp.bean.User;

/**
 * Created by lenovo on 2018/1/8.
 */

public class UserBiz implements IUserBiz {
    @Override
    public void login(final String userName, final String password, final OnLoginListener listener) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if("passionfun".equals(userName) && "123".equals(password)){
                    User user = new User();
                    user.setUserName(userName);
                    user.setPassword(password);
                    listener.loginSuccess(user);
                }else{
                    listener.loginFail();

                }
            }
        }.start();
    }
}
