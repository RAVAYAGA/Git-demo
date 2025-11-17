package com.myProject.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public void addData(String s) {
		if(s.equals(Practice.ss)) {
			System.out.println("true");
		}
	}
	public void addMethod(String data){
        System.out.println("Hi");
	}	
	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
