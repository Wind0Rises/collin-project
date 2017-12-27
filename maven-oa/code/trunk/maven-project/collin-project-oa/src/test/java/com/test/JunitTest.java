package com.test;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.collin.project.ucif.service.CompanyService;

class JunitTest {

	@SuppressWarnings("resource")
	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springcontent.xml");
		CompanyService companyService = (CompanyService) context.getBean("companyService");
		companyService.test();
	}

}
