package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot01HellowordQuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01HellowordQuickApplication.class, args);
	}

}
