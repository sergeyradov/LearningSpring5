package com.learning.java.spring.first.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = { "com.learning.java.spring.first" })
public class SpringContext {

}
