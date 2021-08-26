package com.dippy.ConceptAOP;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class Dippy {

    public void show(){
        System.out.println("Hello");
    }
}
