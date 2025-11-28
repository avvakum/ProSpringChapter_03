package com.avva.three.cdlookup;

public class DefaultContainer implements Container {

    public DefaultContainer() {
        System.out.println(" -----> DefaultContainer: constructor called");
    }

    @Override
    public Object getDependency(String key) {
        if ("provider".equals(key)) {
            return new HelloWorldMessageProvider();
        }
        throw new RuntimeException("Unknown dependency: " + key);
    }
}
