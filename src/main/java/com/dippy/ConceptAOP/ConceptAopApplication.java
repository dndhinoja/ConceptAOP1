package com.dippy.ConceptAOP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConceptAopApplication {

	public static void main(String[] args) {
		ApplicationContext ctx;
		ctx = SpringApplication.run(ConceptAopApplication.class, args);
		Dippy dippy = (Dippy) ctx.getBean(Dippy.class);
	}

}
