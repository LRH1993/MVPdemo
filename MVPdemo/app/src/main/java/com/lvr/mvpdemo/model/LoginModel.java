package com.lvr.mvpdemo.model;

import com.lvr.mvpdemo.model.entities.User;
import com.lvr.mvpdemo.presenter.OnLoginFinishedListener;

/**
 * Created by lvr on 2017/2/6.
 * 模拟登陆的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model层
 */

public interface LoginModel {
    void login(User user, OnLoginFinishedListener listener);
}
