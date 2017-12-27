package com.liu.collin.project.ucif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.collin.project.ucif.service.CompanyService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springcontent.xml");
		CompanyService companyService = (CompanyService) context.getBean("companyService");
		
		companyService.test();
	}
}
