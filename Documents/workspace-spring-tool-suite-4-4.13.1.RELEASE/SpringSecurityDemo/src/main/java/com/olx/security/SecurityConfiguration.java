package com.olx.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserDetailsService userDetailsService;

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception { //used for Authentication
		
		auth.userDetailsService(userDetailsService);
		
		/*
		auth.inMemoryAuthentication()
		.withUser("tom").password(this.passwordEncoder.encode("tom123")).roles("USER")
		.and()
		.withUser("jerry").password(this.passwordEncoder.encode("jerry123")).roles("ADMIN");
	    */
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	 @Override
	 public void configure(HttpSecurity http) throws Exception { //used for Authorization
	     http.authorizeRequests()
	     .antMatchers("/user").hasAnyRole("USER", "ADMIN")
	     .antMatchers("/admin").hasRole("ADMIN")
	     .antMatchers("/all").permitAll()
	     .and()
	     .formLogin();
	  }
	 
}
