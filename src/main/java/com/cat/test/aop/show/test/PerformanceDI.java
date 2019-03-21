package com.cat.test.aop.show.test;


import com.cat.test.aop.show.aop.Audience;
import com.cat.test.aop.show.impl.DancePerformance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class PerformanceDI {
    @Bean
    public Audience audience(){
        return new Audience();
    }

}
