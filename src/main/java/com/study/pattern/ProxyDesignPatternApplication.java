package com.study.pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyDesignPatternApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProxyDesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DbExecuter admin=new ProxyDbManager("admin", "admin");
		admin.excuteQuery("Any operation");
		
		DbExecuter user=new ProxyDbManager("user", "user");
		user.excuteQuery("update");
		user.excuteQuery("DELETE");
		
	}

}
