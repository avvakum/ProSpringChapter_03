package com.avva.three.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class AutowiringConfig {

    @Bean
    Foo anotherFoo() {
        return new Foo();
    }
}
