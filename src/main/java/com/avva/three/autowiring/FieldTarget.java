package com.avva.three.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class FieldTarget {
    @Autowired
    @Qualifier("foo")
    Foo fooOne;

    @Autowired
    @Qualifier("anotherFoo")
    Foo fooTwo;

    @Autowired
    Bar bar;
}
