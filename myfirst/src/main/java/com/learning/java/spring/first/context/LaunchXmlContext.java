package com.learning.java.spring.first.context;

import com.learning.java.spring.first.beans.User;
import com.learning.java.spring.first.business.BusinessService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchXmlContext {
    private static final User user = new User("xmlUSer");
    public static final Logger logger =  LogManager.getLogger(LaunchXmlContext.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BusinessApplicationContext.xml");

        BusinessService businessService = context.getBean(BusinessService.class);
        logger.debug(businessService.calculateSum(user));
    }
}
