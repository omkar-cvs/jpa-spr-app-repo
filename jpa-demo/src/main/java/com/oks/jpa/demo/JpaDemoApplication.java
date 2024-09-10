package com.oks.jpa.demo;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oks.jpa.demo.entity.User;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(JpaDemoApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING : Spring boot application starting");
		SpringApplication.run(JpaDemoApplication.class, args);
		LOG.info("STOPPED  : Spring boot application stopped");

	}

	@Override
	public void run(String... args) throws Exception {
		/*
		LOG.info("EXECUTING : command line runner");

		for (int i = 0; i <= 10; i++) {
			LOG.info("Count =" + i);
		}
		*/
		
		/*
		 * Scanner in=new Scanner(System.in); System.out.println("Enter Name"); String
		 * n=in.nextLine(); System.out.println("Enter Mail Id"); String
		 * mail=in.nextLine(); System.out.println("Enter Password"); String
		 * p=in.nextLine(); User u=new User(n, mail, p);
		 */   
		
		
	}
}
