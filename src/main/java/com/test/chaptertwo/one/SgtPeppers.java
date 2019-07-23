package com.test.chaptertwo.one;

import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's ... ...";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing" + title + " by " + artist);
    }
}
