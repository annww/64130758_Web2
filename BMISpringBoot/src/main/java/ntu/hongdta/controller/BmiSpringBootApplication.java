package ntu.hongdta.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ntu.hongdta") 
public class BmiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmiSpringBootApplication.class, args);
	}

}
