package com.greetings.service;

import com.greetings.api.Greetings;
import com.greetings.bean.GreetingsBean;
import com.greetings.service.impl.GreetingServiceImpl;

public class GreetingsService implements Greetings {

    public GreetingsBean greet() {
        GreetingsBean greetingsBean = new GreetingsBean();
        greetingsBean.setText(GreetingServiceImpl.greet());
        return greetingsBean;
    }
}
