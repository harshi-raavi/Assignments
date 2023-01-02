package com.SpringSecurity.SpringSecurity.Assignments;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SecurityConfigurationAssignment extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource datasource;
	@Override
   protected void  configure(AuthenticationManagerBuilder auth) throws Exception{
		/*
		 * auth.inMemoryAuthentication() .withUser("harshitha") .password("harshi@123")
		 * .roles("ADMIN") .and() .withUser("sushma") .password("sushma@123")
		 * .roles("USER");
		 */
	   auth.jdbcAuthentication()
	       .dataSource(datasource);
   }
   @Bean 
   public PasswordEncoder getPasswordEncoder() 
   { 
	   return NoOpPasswordEncoder.getInstance();
   }
   @Override
   protected void configure(HttpSecurity http) throws Exception
   {
	   http.authorizeRequests()
		   .antMatchers("/adminnn").hasRole("ADMIN")
		   .antMatchers("/userss").hasAnyRole("USER", "ADMIN")
		   .antMatchers("/hello").permitAll() .and().formLogin();
   } 
   
}
