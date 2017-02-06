package com.lvr.mvpdemo.View;

/**
 * Created by lvr on 2017/2/6.
 * 登陆View的接口，实现类也就是登陆的activity
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void showSuccess();
}
