package cn.nextop.startup;

import java.util.Arrays;
import java.util.HashSet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.nextop.core.common.orm.dao")
public class BatchStartup {
	//
	private static final String[] CONFIGS = new String[] {"classpath:core-spring-orm.xml"};
	
	/**
	 * Main 
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BatchStartup.class);
		app.setSources(new HashSet<>(Arrays.asList(CONFIGS))); app.run(args);
	}
}
