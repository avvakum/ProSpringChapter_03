package com.avva.three.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BeanNameGeneratorDemo {

    private static Logger logger = LoggerFactory.getLogger(BeanNameGeneratorDemo.class);

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanNamingConfig.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(beanName -> logger.debug(beanName));

        try {
            var sb = context.getBean("simpleBean");
            logger.debug(" +++---((((( yes!!! )))))---+++");
        } catch (NoSuchBeanDefinitionException nsb) {
            logger.debug(" ===>> >> >> Bean '{}' could not be found.", nsb.getBeanName());
        }
        System.out.println("------------------------------");

        var beans = context.getBeansOfType(SimpleBean.class);
        beans.entrySet().forEach(b -> System.out.println(b.getKey()));
    }
}
