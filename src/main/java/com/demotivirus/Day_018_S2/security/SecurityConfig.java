package com.demotivirus.Day_018_S2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("admin").password("admin").roles("ADMIN"))
//                .withUser(userBuilder.username("user").password("user").roles("USER"))
//                .withUser(userBuilder.username("manager").password("manager").roles("MANAGER"));
        auth.inMemoryAuthentication()
                .withUser("USER").password("USER").roles("USER")
                .and()
                .withUser("ADMIN").password("ADMIN").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("my-login-page")
                .loginProcessingUrl("AUTHENTICATED")
                .permitAll();
    }
}
