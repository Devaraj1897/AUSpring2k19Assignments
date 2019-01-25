package com.au.library.config;

import javax.sql.DataSource;

 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages="com.au.library")
@EnableWebMvc
public class SpringConfig extends WebMvcConfigurationSupport{
 
   /* @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
     
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    
     @Bean
	 public DataSource dataSource() {
	   	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/student");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    return dataSource;
	 }
     */
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/LibraryPortal");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
         
        return dataSource;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource datasource) {
    	JdbcTemplate jdbcTemplate=new JdbcTemplate(datasource);
    	jdbcTemplate.setResultsMapCaseInsensitive(true);
    	return jdbcTemplate;
    }
	

}
