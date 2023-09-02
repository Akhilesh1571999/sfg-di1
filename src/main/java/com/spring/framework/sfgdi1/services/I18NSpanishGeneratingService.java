package com.spring.framework.sfgdi1.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class I18NSpanishGeneratingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello ----- ES";
    }
}
