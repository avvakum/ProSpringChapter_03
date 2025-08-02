package com.avva.three.setter;

import com.avva.three.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterInjectionDemo {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}

// -----( Injecting dependency using setter )-----
// Hello AVVA!