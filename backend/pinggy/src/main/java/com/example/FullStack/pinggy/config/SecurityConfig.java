package com.example.FullStack.pinggy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.header.HeaderWriterFilter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.authentication.AuthenticationEntryPointFailureHandler;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;

import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/post", "/list").permitAll()
                        .anyRequest().authenticated())
                .cors(cors -> cors.configurationSource(request -> {
                    var config = new org.springframework.web.cors.CorsConfiguration();
                    config.setAllowedOrigins(List.of("http://localhost:3000"));
                    config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE"));
                    config.setAllowedHeaders(List.of("*"));
                    config.setAllowCredentials(true);
                    return config;
                }));

        return http.build();
    }
}
