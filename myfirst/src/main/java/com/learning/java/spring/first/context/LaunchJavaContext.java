package com.learning.java.spring.first.context;

import com.learning.java.spring.first.business.BusinessService;
import com.learning.java.spring.first.beans.User;
import org.apache.logging.log4j.LogManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.apache.logging.log4j.Logger;

public class LaunchJavaContext {

    private static final User dummyUser = new User("annotationUser");
    public static Logger logger =  LogManager.getLogger(LaunchJavaContext.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
        BusinessService businessService = context.getBean(BusinessService.class);

        logger.debug(businessService.calculateSum(dummyUser));
    }

}
