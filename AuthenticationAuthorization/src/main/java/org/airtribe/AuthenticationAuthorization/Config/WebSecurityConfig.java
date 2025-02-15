package org.airtribe.AuthenticationAuthorization.Config;

import io.jsonwebtoken.Jwt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
public class WebSecurityConfig {

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(11);
  }

  @Bean
  public JwtFilter jwtFilter() {
    return new JwtFilter();
  }


  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(
            authorizeRequests -> authorizeRequests.requestMatchers("/register", "/verifyRegistration", "/signin", "/hello")
                .permitAll()
                .anyRequest()
                .authenticated())
        .formLogin(formLogin -> formLogin.defaultSuccessUrl("/api/hello", true).permitAll())
        .addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class);

    return httpSecurity.build();
  }
}
