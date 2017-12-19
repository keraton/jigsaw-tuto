module com.greetings.service {
    exports com.greetings.service;
    exports com.greetings.service.impl to com.greetings;

    requires com.greetings.api;
    requires transitive com.greetings.bean;

    provides com.greetings.api.Greetings with com.greetings.service.GreetingsService;
}