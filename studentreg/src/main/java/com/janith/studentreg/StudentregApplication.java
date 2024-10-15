package com.janith.studentreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class StudentregApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = run(StudentregApplication.class, args);
	}

}
