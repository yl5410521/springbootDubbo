package com.alien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.alien.repository.base.BaseRepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.alien"},
repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)//指定自己的工厂类
@EnableTransactionManagement
@EnableCaching
@EnableDubboConfiguration
@ConfigurationProperties(prefix = "dubbo.application")
public class SpringDataJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaCrudApplication.class, args);
	}

}
