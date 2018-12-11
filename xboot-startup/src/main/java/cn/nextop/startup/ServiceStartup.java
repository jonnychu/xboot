package cn.nextop.startup;

import java.util.Arrays;
import java.util.HashSet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.nextop.batch.BatchConfiguration;

@SpringBootApplication
@MapperScan("cn.nextop.core.common.orm.dao")
public class ServiceStartup {
	//
	private static final String[] CONFIGS = new String[] {"classpath:core-spring-orm.xml"};
	private static final Class<?>[] CLAZZ = new Class[] {BatchStartup.class, BatchConfiguration.class};
	
	/**
	 * Main 
	 */
	public static void main(String[] args) throws InterruptedException {
		SpringApplication app = new SpringApplication(CLAZZ);
		app.setSources(new HashSet<>(Arrays.asList(CONFIGS)));
		app.setWebApplicationType(WebApplicationType.NONE); app.run(args);
	}
}
