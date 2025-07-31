package com.avva.three.alias;

import org.springframework.stereotype.Component;

@Component("johnMayer")
//@Award(prize = {"grammy", "platinum disk"})
@Trophy(name = {"grammy", "platinum disk"})
public class Singer {
    private String lyric = "I used to crave the sight of you";

    public void sing() {
        System.out.println(lyric);
    }
}
