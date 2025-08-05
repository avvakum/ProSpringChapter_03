package com.avva.three.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NonSingletonDemo {
    
    private static Logger logger = LoggerFactory.getLogger(NonSingletonDemo.class);

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(Singer.class);
        context.refresh();
        Singer singer1 = context.getBean("nonSingleton", Singer.class);
        Singer singer2 = context.getBean("nonSingleton", Singer.class);

        logger.info("Identity Equal?: " + (singer1 == singer2));
        logger.info("Value Equal?: " + singer1.equals(singer2));

        logger.info(singer1.toString());
        logger.info(singer2.toString());
    }
}
