package com.cat.test.aop.show.test;

import com.cat.test.aop.show.Performance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
//
//@ContextConfiguration(classes = PerformanceDI.class)
public class TestPerformance extends TestBasic{
    @Autowired
    private Performance performance;
    @Test
    public void test1(){
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[] {
//                "spring-mvc.xml"
//        });
        performance.perform();
    }
}
