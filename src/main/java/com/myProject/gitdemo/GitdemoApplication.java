package com.myProject.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public void addData(String s) {
		System.out.println(s);
		if(s.equals("Hellow")) {
			System.out.println("true");
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
