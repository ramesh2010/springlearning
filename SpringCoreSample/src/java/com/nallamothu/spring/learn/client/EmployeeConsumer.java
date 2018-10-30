package com.nallamothu.spring.learn.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nallamothu.spring.learn.model.Employee;

public class EmployeeConsumer {
	static Logger logger = LoggerFactory.getLogger(EmployeeConsumer.class);
	
	public static void main(String[] args) {
		
		/* Developer way */
		logger.info("1. Data set by developer through code");

		// Object construction ...done by developer
		Employee eRef = new Employee();
		eRef.setEid(1);
		eRef.setFname("Ramesh");
		eRef.setLname("Nallamothu");
		logger.info("Employee Details: " + eRef);

		/* Spring Way | IOC=Inversion of Control */
		logger.info("\n2. Data set by Spring IoC using XML");

		logger.info("2.1 Using BeanFactory!");
		// One Application container
		Resource resource = new ClassPathResource("bean-data.xml");
		// Spring Container which shall parse XML File and construct objects
		BeanFactory factory = new XmlBeanFactory(resource);//objects are not loaded yet

		Employee e1 = (Employee) factory.getBean("ramesh");//object is loaded now
		Employee e2 = factory.getBean("nithya", Employee.class);
		logger.info("Employee 1 details: " + e1);
		logger.info("Employee 2 details: " + e2);

		logger.info("\n2.2 Using ApplicationContext!");
		// Another Application container
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-data.xml");//objects are pre-loaded
		Employee e3 = context.getBean("ramesh", Employee.class);
		logger.info("Employee 1 details: " + e3);

		ClassPathXmlApplicationContext appContext = (ClassPathXmlApplicationContext) context;
		appContext.close(); // Close the context
	}
}
