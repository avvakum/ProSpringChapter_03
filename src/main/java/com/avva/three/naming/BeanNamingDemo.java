package com.avva.three.naming;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BeanNamingDemo {

    private static Logger logger = LoggerFactory.getLogger(BeanNamingDemo.class);

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanNamingConfig.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(beanName -> logger.debug(beanName));

        try {
            context.getBean(SimpleBean.class);
        } catch (Exception e) {
            logger.debug("More beans than expected found. ", e);
        }

        logger.info(" ... All beans of type: {} ", SimpleBean.class.getSimpleName());
        var beans = context.getBeansOfType(SimpleBean.class);
        beans.entrySet().forEach(b -> System.out.println(b.getKey()));
    }
}
