package com.lvr.mvpdemo.model.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.lvr.mvpdemo.model.LoginModel;
import com.lvr.mvpdemo.model.entities.User;
import com.lvr.mvpdemo.presenter.OnLoginFinishedListener;

/**
 * Created by lvr on 2017/2/6.
 * 延时模拟登陆（2s），如果用户名或者密码为空则登陆失败，否则登陆成功
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(User user, final OnLoginFinishedListener listener) {
        final String username = user.getUsername();
        final String password = user.getPassword();
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
