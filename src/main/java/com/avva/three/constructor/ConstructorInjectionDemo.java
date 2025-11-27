package com.avva.three.constructor;

import com.avva.three.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorInjectionDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class); // <1>
        MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}

// -----( Injecting dependency using constructor )-----
//
//Hello AVVA!





