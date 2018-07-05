package com.taidii.staffdevelopment.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taidii.staffdevelopment.commons.RedisTemplateHelper;
import com.taidii.staffdevelopment.util.TaidiiRequestUtil;

@Configuration
public class Config {

	 // 资源DB
    @Bean(name = "staffDevelopmentDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.staffdevelopment") // application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
	
    @Bean
    public TaidiiRequestUtil TaidiiRequestUtil() {
    	return new TaidiiRequestUtil();
    }
    
    @Bean
	public RedisTemplateHelper getRedisTemplateHelper()
	{
		return new RedisTemplateHelper();
	}

}
