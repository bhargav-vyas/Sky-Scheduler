package com.tka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable())  // Disable CSRF (only for testing)
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/api/**").authenticated() // Secure API endpoints
	                .anyRequest().permitAll()
	            )
	            .httpBasic(); // Enable Basic Authentication

	        return http.build();
	    }

	    @Bean
	    public UserDetailsService userDetailsService() {
	        UserDetails user = User.withDefaultPasswordEncoder()
	                .username("admin")
	                .password("admin")
	                .roles("USER")
	                .build();

	        return new InMemoryUserDetailsManager(user);
	    }
	}
	

