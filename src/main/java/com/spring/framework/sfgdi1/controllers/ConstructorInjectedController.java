package com.spring.framework.sfgdi1.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.spring.framework.sfgdi1.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService  greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
