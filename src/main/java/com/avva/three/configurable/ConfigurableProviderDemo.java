package com.avva.three.configurable;

import com.avva.three.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurableProviderDemo {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}

// -----( Injecting 'Configurable message' value into constructor )-----
// -----( Injecting dependency using constructor )-----
//Configurable message
