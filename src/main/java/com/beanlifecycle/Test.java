package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beanlifecycle.xml");
		
		 Clothes clothes = (Clothes) context.getBean("clt");
		 System.out.println(clothes);
		 context.registerShutdownHook();
	}

}
