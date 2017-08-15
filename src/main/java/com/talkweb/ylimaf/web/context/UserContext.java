package com.talkweb.ylimaf.web.context;

import com.talkweb.ylimaf.web.pojo.User;

/**
 * Created by ZhuXu on 2016/11/17 0017.
 */
public class UserContext implements AutoCloseable {

    public static final ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    public UserContext(User user) {
        userThreadLocal.set(user);
    }

    public static User getUser() {
        return userThreadLocal.get();
    }

    @Override
    public void close() {
        userThreadLocal.remove();
    }
}
