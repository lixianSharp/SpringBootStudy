package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能；
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HellowordQuickApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testHelloService(){
		//测试容器中有没有helloService
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);//如果没有使用@ImportResource，则输出结果为false
	}
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
