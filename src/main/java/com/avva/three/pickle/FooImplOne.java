package com.avva.three.pickle;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.UUID;

class FooImplOne implements Foo {
    String id = "one:" + UUID.randomUUID().toString().replace("-", "").substring(0, 8);

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .toString();
    }
}
