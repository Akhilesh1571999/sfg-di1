package com.spring.framework.sfgdi1;

import com.spring.framework.sfgdi1.controllers.ConstructorInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.spring.framework.sfgdi1.services.ConstructorGreetingServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());

    }
     @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}