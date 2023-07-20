package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/getMan").authenticated()
		.antMatchers("/getGirl").authenticated()
		.antMatchers("/getAll").permitAll()
		.and().formLogin()
		.and().httpBasic();
	}
	
	// by Using in Memory Authentication
	  	@Override protected void configure(AuthenticationManagerBuilder auth) throws
	  	Exception { auth.inMemoryAuthentication()
	 	.withUser("suraj").password("Suraj@123").authorities("admin").and()
	  	.withUser("manwar").password("Manwar@123").authorities("reed"); 
	  	}
	 

	
}
