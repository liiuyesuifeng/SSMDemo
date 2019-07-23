package com.cat.test.aop.show.impl;

import com.cat.test.aop.show.Performance;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ComponentScan
@Component("performance")
public class DancePerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("show Time!@!!!!!");
    }
}
