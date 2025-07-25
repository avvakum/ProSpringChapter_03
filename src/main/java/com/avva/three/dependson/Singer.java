package com.avva.three.dependson;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@DependsOn("gopher")
@Component("johnMayer")
class Singer implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    private Guitar guitar;

    public Singer() {
    }

    public void sing() {
        guitar = context.getBean("gopher", Guitar.class);
        guitar.sing();
    }
}
