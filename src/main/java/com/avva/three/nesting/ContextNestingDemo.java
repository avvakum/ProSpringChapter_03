package com.avva.three.nesting;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextNestingDemo {

    public static void main(String[] args) {
        var parentContext = new AnnotationConfigApplicationContext();
        parentContext.register(ParentConfig.class);
        parentContext.refresh();

        var childContext = new AnnotationConfigApplicationContext();
        childContext.register(ChildConfig.class);
        childContext.setParent(parentContext);
        childContext.refresh();

        Song song1 = (Song) childContext.getBean("song1");
        Song song2 = (Song) childContext.getBean("song2");
        Song song3 = (Song) childContext.getBean("song3");
        System.out.println("from parent ctx: " + song1.getTitle());
        System.out.println("from parent ctx: " + song2.getTitle());
        System.out.println("from child ctx: " + song3.getTitle());
    }
}

//from parent ctx: Gravity
//from parent ctx: Daughters
//from child ctx: No Such Thing
