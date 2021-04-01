package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("beanlifecycle.xml");
		
		 context.registerShutdownHook();
		
		 Clothes clothes = (Clothes) context.getBean("clt");
		 System.out.println(clothes);
		
		 System.out.println("+++++++for the Interface++++++++++++");
		 Food f1 = (Food) context.getBean("f1");
		 System.out.println(f1);
		 context.registerShutdownHook();

	}

}
