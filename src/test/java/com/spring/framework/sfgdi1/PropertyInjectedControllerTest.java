package com.spring.framework.sfgdi1;

import com.spring.framework.sfgdi1.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.spring.framework.sfgdi1.services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUP(){

        controller = new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}