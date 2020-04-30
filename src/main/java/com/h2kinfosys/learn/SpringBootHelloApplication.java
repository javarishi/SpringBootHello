package com.h2kinfosys.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootHelloApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootHelloApplication.class, args);

		Laptop laptop = context.getBean(Laptop.class);
		laptop.showLaptop();
		
		Laptop laptop1 = context.getBean(Laptop.class);
		
		if(laptop.equals(laptop1)) {
			System.out.println("Singleton");
		}else {
			System.out.println("prototype");
		}
		
		// get hard drives from laptops and compare
	}

}
