package com.avva.three.autowiring;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
class Foo {
    String id = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
}
