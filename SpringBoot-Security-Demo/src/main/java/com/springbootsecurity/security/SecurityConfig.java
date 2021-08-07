package com.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("samba").password("samba@").roles("USER").and()
		                             .withUser("admin").password("admin").roles("ADMIN");
		
	}
	
	public void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/api/employees").hasRole("ADMIN")
		                        .and().csrf().disable()
		                        .formLogin()
		                        .and().exceptionHandling().accessDeniedPage("/api/404");
	}
	
//	@Bean
//    public  PasswordEncoder passwordEncoder() {
//       
//         return new BCryptPasswordEncoder();
//       
//    }
	@Bean
    public  PasswordEncoder passwordEncoder() {
       
         return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
       
    }
}
