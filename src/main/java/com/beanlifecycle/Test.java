package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("beanlifecycle.xml");
		
		 context.registerShutdownHook();
		
		 Clothes clothes = (Clothes) context.getBean("clt");
		 System.out.println(clothes);
		
		 System.out.println("*************for Interface*************");
		 Food food = (Food) context.getBean("food");
		 System.out.println(food);

		 System.out.println("************Annotation****************");
		 Example example = (Example) context.getBean("example");
		 System.out.println(example);
		 
	}

}
