package com.avva.three.naming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class BeanNamingConfig {

    @Bean SimpleBean anotherSimpleBean() {
        return new SimpleBean();
    }
}
