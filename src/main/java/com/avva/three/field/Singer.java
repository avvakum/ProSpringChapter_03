package com.avva.three.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("singer")
class Singer {
    @Autowired
    private Inspiration inspirationBean;

    public void sing() {
        System.out.println("... " + inspirationBean.getLyric());
    }
}
