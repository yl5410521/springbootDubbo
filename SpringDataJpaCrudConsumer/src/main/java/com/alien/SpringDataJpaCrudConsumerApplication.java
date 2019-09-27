package com.alien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;


@SpringBootApplication
@EnableDubboConfiguration
@ConfigurationProperties(prefix = "dubbo.application")
public class SpringDataJpaCrudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaCrudConsumerApplication.class, args);
	}

}
