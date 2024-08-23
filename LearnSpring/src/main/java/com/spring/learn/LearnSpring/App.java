package com.spring.learn.LearnSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.base.Alien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/configxml/projectConfing.xml");  
        Alien objAlien = (Alien) context.getBean("alienobj");
        objAlien.code();
    }
}
