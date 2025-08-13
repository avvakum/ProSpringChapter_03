package com.avva.three.valinject.speldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("injectSimpleSpEL")
public class InjectSimpleSpELDemo {

    @Value("#{injectSimpleConfig.name.toUpperCase()}")
    private String name;

    @Value("#{injectSimpleConfig.age + 1}")
    private int age;

    @Value("#{injectSimpleConfig.height}")
    private float height;

    @Value("#{injectSimpleConfig.developer}")
    private boolean developer;

    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(InjectSimpleConfig.class, InjectSimpleSpELDemo.class);
        context.refresh();

        InjectSimpleSpELDemo simple = (InjectSimpleSpELDemo) context.getBean("injectSimpleSpEL");
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

//Name: JOHN MAYER
//Age: 41
//Age in Seconds: 1241401112
//Height: 1.92
//Is Developer?: false
