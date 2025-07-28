package com.avva.three.field;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingerFieldInspirationDemo {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(Singer.class, Inspiration.class);
        context.refresh();

        Singer singerBean = context.getBean(Singer.class);
        singerBean.sing();
    }
}

// ... For all my running, I can understand