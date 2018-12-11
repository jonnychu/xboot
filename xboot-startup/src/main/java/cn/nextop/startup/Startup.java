package cn.nextop.startup;

import static java.util.Arrays.asList;
import static org.springframework.boot.WebApplicationType.NONE;

import java.util.HashSet;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.nextop.core.common.orm.dao")
public abstract class Startup {
	//
	private SpringApplication app;
	private final String[] base = new String[] {"classpath:core-spring-orm.xml"};
	
	//
	protected abstract String[] getConfigs();
	
	public void run(Class<?>[] clazz) {
		List<String> configs = asList(base);
		configs.addAll(asList(getConfigs()));
		this.app = new SpringApplication(clazz); 
		this.app.setSources(new HashSet<>(configs));
		this.app.setWebApplicationType(NONE); this.app.run(base);
	}
}
