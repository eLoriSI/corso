package com.springboot.corso.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/corso").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/corso/{idCorso}").hasRole("USER")
                        .requestMatchers(HttpMethod.POST, "/corso").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/corso").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/corso/{idCorso}").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.GET, "/studente").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/studente/{idStudente}").hasRole("USER")
                        .requestMatchers(HttpMethod.POST, "/studente").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/studente").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/studente/{idStudente}").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.GET, "/professore").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/professore/{idProfessore}").hasRole("USER")
                        .requestMatchers(HttpMethod.POST, "/professore").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/professore").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/professore/{idProfessore}").hasRole("ADMIN")

                        .requestMatchers(
                                "/v1/api/get-token",
                                "/swagger-ui.html",
                                "/swagger-ui/*",
                                "/v3/api-docs/**",
                                "/swagger-resources/**",
                                "/webjars/**").permitAll()
                        .anyRequest().authenticated()
        );

        httpSecurity.httpBasic(Customizer.withDefaults());

        httpSecurity.csrf(csrf -> csrf.disable());

        return httpSecurity.build();
    }
}
