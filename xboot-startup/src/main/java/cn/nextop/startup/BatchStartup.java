package cn.nextop.startup;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchStartup {
	//
	private static final String[] CONFIGS = new String[] {"classpath:demo.xml"};
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BatchStartup.class);
		app.setSources(new HashSet<>(Arrays.asList(CONFIGS))); app.run(args);
	}
}
