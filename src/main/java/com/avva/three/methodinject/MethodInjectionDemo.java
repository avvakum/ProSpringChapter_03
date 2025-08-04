package com.avva.three.methodinject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StopWatch;

public class MethodInjectionDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LookupConfig.class);

        var abstractLockOpener = context.getBean("abstractLockOpener", LockOpener.class);
        var standardLockOpener = context.getBean("standardLockOpener", LockOpener.class);

        displayInfo("abstractLockOpener", abstractLockOpener);
        displayInfo("standardLockOpener", standardLockOpener);
    }

    public static void displayInfo(String beanName, LockOpener lockOpener) {
        var keyHelperOne = lockOpener.getMyKeyOpener();
        var keyHelperTwo = lockOpener.getMyKeyOpener();

        System.out.println("[" + beanName + "]: KeyHelper Instance the Same? " + (keyHelperOne == keyHelperTwo));

        var stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");

        for (var x = 0; x < 100_000; x++) {
            var keyHelper = lockOpener.getMyKeyOpener();
            keyHelper.open();
        }
        stopWatch.stop();
        System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
