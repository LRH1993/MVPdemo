package com.lvr.mvpdemo.presenter;

/**
 * Created by lvr on 2017/2/6.
 * 登陆事件监听
 */

public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
