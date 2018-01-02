/*
 * @(#) DatabaseConfig.java
 *
 * v1.0.0 / 2017. 12. 25.
 *
 * Copyright ((c) 2017 by HST, Inc. All Rights Reserved.
 */
package com.hst.pofoland.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;
import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import net.sf.log4jdbc.tools.Log4JdbcCustomFormatter;
import net.sf.log4jdbc.tools.LoggingType;

@Slf4j
public class DatabaseConfig {

	@Autowired
	private Environment env;

	@Bean(name = "dataSource")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("database.driverClassName"));
		dataSource.setUrl(env.getProperty("database.url"));
		dataSource.setUsername(env.getProperty("database.username"));
		dataSource.setPassword(env.getProperty("database.password"));

		log.info("Create Datasource {}", dataSource);

		return dataSource;
	}

	@Bean(name = "loggingDataSource")
	public DataSource loggingDataSource(DataSource dataSource) {
		Log4JdbcCustomFormatter formatter = new Log4JdbcCustomFormatter();
		formatter.setLoggingType(LoggingType.MULTI_LINE);
		formatter.setSqlPrefix("SQL : ");

		Log4jdbcProxyDataSource loggingDataSource = new Log4jdbcProxyDataSource(dataSource);
		loggingDataSource.setLogFormatter(formatter);
		return loggingDataSource;
	}

}
