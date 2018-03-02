package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.itcast.springboot.properties.ItcastProperties;

/**
 * @SpringBootApplication 必须要在springboot项目的引导类上方添加；标注为项目的入口，可以扫当前包及其子包的spring注解
 * @EnableConfigurationProperties 加载那些自定义配置类
 */
@EnableConfigurationProperties(ItcastProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setBannerMode(Mode.OFF);//去掉banner
		springApplication.run(args);
	}
}
