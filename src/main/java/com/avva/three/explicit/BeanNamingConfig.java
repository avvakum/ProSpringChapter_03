package com.avva.three.explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class BeanNamingConfig {

    //@Bean(name = "simpleBeanTwo")
    //@Bean(value = "simpleBeanTwo")
    @Bean("simpleBeanTwo")
    public SimpleBean simpleBean2() {
        return new SimpleBean();
    }

    //@Bean(name= {"simpleBeanThree", "three", "numero_tres"})
    //@Bean(value= {"simpleBeanThree", "three", "numero_tres"})
    @Bean({"simpleBeanThree", "three", "numero_tres"})
    public SimpleBean simpleBean3() {
        return new SimpleBean();
    }
}
