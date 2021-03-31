package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("colection.xml");
	Employee employee = (Employee) context.getBean("employee");
	
	System.out.println(employee.getName());
	System.out.println(employee.getPhones());
	System.out.println(employee.getAddress());
	System.out.println(employee.getCourses());

}
}
