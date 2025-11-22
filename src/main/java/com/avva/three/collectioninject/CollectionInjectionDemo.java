package com.avva.three.collectioninject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollectionInjectionDemo {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext();
        context.register(CollectionConfig.class, CollectingBean.class);
        context.refresh();

        var collectingBean = context.getBean(CollectingBean.class);
        collectingBean.printCollections();
    }
}

// -- list injected using @Autowired --
// Here's to hoping
// Wishing the best for your
//-- list injected using @Resource / @Autowired @Qualifier("list") / @Inject @Named("list") --
// Not the end
// Rise Up
//-- set injected using @Autowired -- --
// Here's to hoping
// Wishing the best for your
//-- set injected using @Resource / @Autowired @Qualifier("set") / @Inject @Named("set") --
// Ordinary Day
// Birds Fly
//-- map injected using  @Autowired --
//song1:  Here's to hoping
//song2:  Wishing the best for your
//-- map injected using @Resource / @Autowired @Qualifier("map") / @Inject @Named("map")--
//Ben Barnes:  11:11
//John Mayer:  Gravity
//-- props injected with @Autowired --
//said.she:  Never Mine
//said.he:  Cold and jaded
