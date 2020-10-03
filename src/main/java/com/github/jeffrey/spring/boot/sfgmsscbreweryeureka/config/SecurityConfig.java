package com.github.jeffrey.spring.boot.sfgmsscbreweryeureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jeffreymzd on 10/3/20
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * Disable csrf
     * Authorize all requests
     * Authenticated all requests with HTTP Basic
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }
}
