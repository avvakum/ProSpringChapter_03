package com.avva.three.pickle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PickleAutowiringDemo {
    private static Logger logger = LoggerFactory.getLogger(PickleAutowiringDemo.class);

    public static void main(String... args) {
        var ctx = new AnnotationConfigApplicationContext(AutowiringConfig.class);
        var target = ctx.getBean(TrickyTarget.class);
        logger.info("target: Created target? {}" , target != null);
        logger.info("target: Injected bar? {}" , target.bar != null);
        logger.info("target: Injected fooOne? {}" , target.fooOne != null ? target.fooOne.toString(): "");
        logger.info("target: Injected fooTwo? {}" , target.fooTwo != null ? target.fooTwo.toString() : "");
    }
}
