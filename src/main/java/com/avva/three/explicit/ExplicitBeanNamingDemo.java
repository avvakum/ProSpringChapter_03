package com.avva.three.explicit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ExplicitBeanNamingDemo {
    private static Logger logger = LoggerFactory.getLogger(ExplicitBeanNamingDemo.class);

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BeanNamingConfig.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(beanName -> logger.debug(beanName));

        var simpleBeans = context.getBeansOfType(SimpleBean.class);
        simpleBeans.forEach((k, v) -> {
            String[] aliases = context.getAliases(k);
            if (aliases.length > 0) {
                logger.debug("Aliases for {} ", k);
                Arrays.stream(aliases).forEach(a -> logger.debug("\t {}", a));
            }
        });
    }
}
