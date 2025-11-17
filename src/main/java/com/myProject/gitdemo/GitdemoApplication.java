package com.myProject.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public void addData() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
