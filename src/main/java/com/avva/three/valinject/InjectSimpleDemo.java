package com.avva.three.valinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("injectSimple")
public class InjectSimpleDemo {

    @Value("John Mayer")
    private String name;
    @Value("40")
    private int age;
    @Value("1.92")
    private float height;
    @Value("false")
    private boolean developer;
    @Value("1241401112")
    private long ageInSeconds;

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(InjectSimpleDemo.class);
        context.refresh();

        InjectSimpleDemo simple = (InjectSimpleDemo) context.getBean("injectSimple");
        System.out.println(simple);
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Developer?: " + developer;
    }
}

//Name: John Mayer
//Age: 40
//Age in Seconds: 1241401112
//Height: 1.92
//Is Developer?: false
