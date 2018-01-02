/*
 * @(#) WebConfiguration.java
 *
 * v1.0.0 / 2017. 12. 25.
 *
 * Copyright ((c) 2017 by HST, Inc. All Rights Reserved.
 */
package com.hst.pofoland.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.hst.pofoland.common.interceptor.AuthInspectionInterceptor;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan(
	basePackages = "com.hst.pofoland",
	includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
	},
	excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class}),
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Repository.class})            
	}
)
@EnableWebMvc
@Slf4j
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		log.info("View template engine JSP");
		registry.jsp("/WEB-INF/pofoland/", ".jsp");
	}

	/**
	 * 인증권한검사를 위한 AuthInterceptor
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration authInterceptorRegistry = registry.addInterceptor(new AuthInspectionInterceptor());
		authInterceptorRegistry.addPathPatterns("/**");
		authInterceptorRegistry.excludePathPatterns("/");
		authInterceptorRegistry.excludePathPatterns("/home");
		authInterceptorRegistry.excludePathPatterns("/assets/**");
		authInterceptorRegistry.excludePathPatterns("/vendor/**");
	}
	
	/**
	 * tiles bean 설정
	 * @return
	 */
	@Bean
	public TilesViewResolver TilesViewResolver () {
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		tilesViewResolver.setOrder(1);
		
		return tilesViewResolver;
	}
	@Bean
	public TilesConfigurer tilesConfigurer () {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		
		tilesConfigurer.setDefinitions(new String [] {("classpath:/tiles/tiles.xml")});
		tilesConfigurer.setCheckRefresh(true);
		
		return tilesConfigurer;
	}
}
