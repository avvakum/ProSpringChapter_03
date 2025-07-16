package com.avva.three.cdlookup;

public class CDLDemo {
    public static void main(String[] args) {
        Container container = new DefaultContainer();

        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.performLookup(container);

        renderer.render();
    }
}

// -----> DefaultContainer: constructor called
// -----> StandardOutMessageRenderer: constructor called
// -----> HelloWorldMessageProvider: constructor called
// Hello AVVA!