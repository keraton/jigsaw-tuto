package com.greetings.api;

import com.greetings.bean.GreetingsBean;

import java.util.Optional;
import java.util.ServiceLoader;

public interface Greetings {

    GreetingsBean greet();

    static Greetings create() {
        ServiceLoader<Greetings> greetings = ServiceLoader.load(Greetings.class);

        Optional<Greetings> greetingImpl = greetings.findFirst();
        return greetingImpl.orElse(null);
    }
}
