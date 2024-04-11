//package com.swaraj.TodoList.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableMethodSecurity
//public class SpringConfig {
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public UserDetailsService userDetailsService() {
//	
//		UserDetails normalUser = User.withUsername("swaraj")
//				                     .password(passwordEncoder().encode("password"))
//				                     .roles("NORMAL")
//				                     .build();
//		UserDetails adminUser = User.withUsername("swaraj1")
//				                    .password(passwordEncoder().encode("password"))
//				                    .roles("ADMIN")
//				                    .build();
//		
//		return new InMemoryUserDetailsManager(normalUser, adminUser);
//	}
//
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//
//			httpSecurity.csrf().disable()
//			.authorizeHttpRequests()
////			.requestMatchers("/add")
////			.hasRole("ADMIN")
////			.requestMatchers("/get")
////			.hasRole("NORMAL")
////			.requestMatchers("/task")
//		//	.permitAll()
//			.anyRequest()
//			.authenticated()
//			.and()
//			.formLogin();
//		
//		return httpSecurity.build();
//	}
//	
//}
