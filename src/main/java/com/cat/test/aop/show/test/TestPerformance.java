package com.cat.test.aop.show.test;

import com.cat.test.aop.show.Performance;
import com.cat.test.aop.show.TrackPlay;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
//
//@ContextConfiguration(classes = PerformanceDI.class)
public class TestPerformance extends TestBasic{
    @Autowired
    private Performance performance;
    @Autowired
    private TrackPlay trackPlay;

    @Test
    public void test1(){
        trackPlay.play(1);
    }
}
