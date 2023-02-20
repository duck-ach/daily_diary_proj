package com.himes.diary.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@MapperScan(basePackages = {"com.himes.diary.mapper"})
@PropertySource(value = {"classpath:application.yml"})
@EnableAspectJAutoProxy 
// Aspect를 자동으로 동작시키는 애너테이션

@EnableTransactionManagement 
// Transaction Manager를 허용하는 애너테이션

@Configuration 
// Bean 등록을 하기 위한 애너테이션 (@Configuration을 선언하고 등록할 각 메소드에 @Bean을 선언)
public class DBConfig {

	@Value(value = "${spring.datasource.hikari.driver-class-name}")
	private String driverClassName;
	
	@Value(value="${spring.datasource.hikari.jdbc-url}")
	private String jdbcUrl;
	
	@Value(value="${spring.datasource.hikari.username}")
	private String username;
	
	@Value(value="${spring.datasource.hikari.password}")
	private String password;
	
	@Value(value="${mybatis.mapper-locations}")
	private String mapperLocations;
	
	@Value(value="${mybatis.config-location}")
	private String configLocation;

    @Bean
    HikariConfig config() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(driverClassName);
        config.setJdbcUrl(jdbcUrl);
        config.setUsername(username);
        config.setPassword(password);
        return config;
    }
	
	@Bean(destroyMethod="close")
	HikariDataSource dataSource() {
		return new HikariDataSource(config());
	}
	
	@Bean
	SqlSessionFactory factory() throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
		bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(configLocation));
		return bean.getObject();
	}
	
	@Bean
	SqlSessionTemplate sqlSessionTemplate() throws Exception {
		return new SqlSessionTemplate(factory());
	}
	
	@Bean
	TransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
}
