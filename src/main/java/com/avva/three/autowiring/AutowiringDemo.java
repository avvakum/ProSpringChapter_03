package com.avva.three.autowiring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringDemo {
    private static Logger LOGGER = LoggerFactory.getLogger(AutowiringDemo.class);

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AutowiringConfig.class);

        Target target = context.getBean(Target.class);
        LOGGER.info("target: Created target? {}", target != null);
        LOGGER.info("target: Injected bar? {}", target.bar != null);
        LOGGER.info("target: Injected fooOne? {}", target.fooOne != null ? target.fooOne.id : "");
        LOGGER.info("target: Injected fooTwo? {}", target.fooTwo != null ? target.fooTwo.id : "");
        LOGGER.info("----------------------------------------------------------------------------------------");

        AnotherTarget anotherTarget = context.getBean(AnotherTarget.class);
        LOGGER.info("anotherTarget: Created anotherTarget? {}", anotherTarget != null);
        LOGGER.info("anotherTarget: Injected bar? {}", anotherTarget.bar != null);
        LOGGER.info("anotherTarget: Injected fooOne? {}", anotherTarget.fooOne != null ? anotherTarget.fooOne.id : "");
        LOGGER.info("anotherTarget: Injected fooTwo? {}", anotherTarget.fooTwo != null ? anotherTarget.fooTwo.id : "");
        LOGGER.info("----------------------------------------------------------------------------------------");

        FieldTarget fieldTarget = context.getBean(FieldTarget.class);
        LOGGER.info("fieldTarget: Created fieldTarget? {}", fieldTarget != null);
        LOGGER.info("fieldTarget: Injected bar? {}", fieldTarget.bar != null);
        LOGGER.info("fieldTarget: Injected fooOne? {}", fieldTarget.fooOne != null ? fieldTarget.fooOne.id : "");
        LOGGER.info("fieldTarget: Injected fooTwo? {}", fieldTarget.fooTwo != null ? fieldTarget.fooTwo.id : "");
    }
}
