package com.avva.three.generator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(nameGenerator = SimpleBeanNameGenerator.class)
class BeanNamingConfig {
    @Bean
    public SimpleBean anotherSimpleBean() {
        return new SimpleBean();
    }
}
