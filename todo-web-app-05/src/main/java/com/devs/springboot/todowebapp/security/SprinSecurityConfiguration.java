package com.devs.springboot.todowebapp.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SprinSecurityConfiguration {

//	LDAP or Database is usually use
//	For now we'll use In Memory
	
//	InMemoryUserDetailsManager
//	InMemoryUserDetailsManager(UserDetails...users)
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetails1 = createNewUser("devs", "pass");
		UserDetails userDetails2 = createNewUser("streebo", "pass");
		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

private UserDetails createNewUser(String username, String password) {
	Function<String, String> PasswordEncoder
	= input -> passwordEncoder().encode(input);
	
	UserDetails userDetails = User.builder()
			.passwordEncoder(PasswordEncoder)
			.username(username)
			.password(password)
			.roles("USER","ADMIN").build();
	return userDetails;
}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// By Default All URLs are protected
	// A login form is shown for unauthorized request
	// CSRF needs to disable to use h2 console
	// Frames does not allowed by spring security
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);
		http.formLogin(withDefaults());
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
}
