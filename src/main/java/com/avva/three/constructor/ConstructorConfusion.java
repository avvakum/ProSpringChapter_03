package com.avva.three.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConstructorConfusion {
    private String someValue;

    // @Autowired
    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }
    //ConstructorConfusion(String) called
    //Does this work? Stringyyyiii!!!

    @Autowired // this is what makes this work
    public ConstructorConfusion(@Value("90") int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    @Override
    public String toString() {
        return someValue;
    }

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(ConstructorConfusion.class);
        context.refresh();

        var cc = context.getBean(ConstructorConfusion.class);
        System.out.println("Does this work? " + cc);
    }
}

// ConstructorConfusion(int) called
// Does this work? Number: 90