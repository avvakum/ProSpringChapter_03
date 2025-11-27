package com.avva.three.dependson;

import org.springframework.stereotype.Component;

@Component("gopher")
class Guitar {
    public void sing() {
        System.out.println("Cm Eb Fm Ab Bb");
    }
}
