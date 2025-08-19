package com.avva.three.pickle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
class AutowiringConfig {

    @Bean
    //@Primary
    public Foo fooImplOne() {
        return new FooImplOne();
    }

    @Bean
    public Foo fooImplTwo() {
        return new FooImplTwo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public TrickyTarget trickyTarget() {
        return new TrickyTarget();
    }
}
