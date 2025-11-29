package com.avva.three.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(Singer.class, Guitar.class);
        context.refresh();

        Singer johnMayer = context.getBean("johnMayer", Singer.class);
        johnMayer.sing();
    }
}
