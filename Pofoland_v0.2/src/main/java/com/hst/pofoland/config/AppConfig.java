package com.hst.pofoland.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import({
	DatabaseConfig.class,
	MybatisConfig.class
})
@PropertySources({
	@PropertySource("classpath:/properties/app-default.properties"),
	@PropertySource("classpath:/properties/db-default.properties")
})
@ComponentScan(
	basePackages = "com.hst.pofoland",
	excludeFilters = {
			@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
	}
)
public class AppConfig {
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
