package com.avva.three.autowiring;

import com.avva.three.alias.Award;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class Target {

    private static Logger logger = LoggerFactory.getLogger(Target.class);
    Foo fooOne;
    Foo fooTwo;
    Bar bar;

    public Target() {
        logger.info(" --> Target() called");
    }


    @Autowired
    public Target(@Qualifier("foo") Foo foo) {
        this.fooOne = foo;
        logger.info(" --> Target(Foo) called");
    }

    //@Autowired
    public Target(@Qualifier("foo") Foo foo, Bar bar) {
        this.fooOne = foo;
        this.bar = bar;
        logger.info(" --> Target(Foo, Bar) called");
    }
}
