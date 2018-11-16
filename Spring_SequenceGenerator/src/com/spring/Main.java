/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Zahid Iqbal Tushar <zi.tushar@gmail.com / zi.tushar@live.com>
 */
public class Main {
    
    public static void main (String[] args){
        ApplicationContext context
                = new GenericXmlApplicationContext("resource/beans.xml");

        SequenceGenerator generator
                = (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
    
}
