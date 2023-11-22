package com.educandoweb.course;

import jakarta.servlet.ServletRegistration;
import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
		System.out.println();
		System.out.println("hello world");

	}
	@Bean
	ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebdavServlet());
		registrationBean.addUrlMappings("/h2-console");   //esse url influencia muito nao so o properties como esse
		return registrationBean;
	}

}
