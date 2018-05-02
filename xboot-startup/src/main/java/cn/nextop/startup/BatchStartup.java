package cn.nextop.startup;

import java.util.Arrays;
import java.util.HashSet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.nextop.core.common.orm.service.UserService;

@SpringBootApplication
@MapperScan("cn.nextop.core.common.orm.dao")
public class BatchStartup implements CommandLineRunner {
	
	@Autowired UserService service;
	
	//
	private static final String[] CONFIGS = new String[] {"classpath:core-spring-orm.xml"};
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BatchStartup.class);
		app.setSources(new HashSet<>(Arrays.asList(CONFIGS))); app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.test();
		
	}
}
