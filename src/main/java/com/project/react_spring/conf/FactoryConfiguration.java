//package com.project.react_spring.conf;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.web.servlet.headers.HttpPublicKeyPinningDsl;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//import javax.sql.DataSource;
//
//@Configuration
////@EnableWebSecurity
//public class FactoryConfiguration extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    DataSource dataSource;
////
//
//
////    @Bean
////    public PasswordEncoder getPasswordEncoder(){
////        return NoOpPasswordEncoder.getInstance();
////    }
////
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        return bCryptPasswordEncoder;
//    }
//
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
////        http.csrf().disable().authorizeRequests()
////                .antMatchers("/").permitAll()
////                .antMatchers(HttpMethod.POST,"/api").permitAll()
////                .antMatchers(HttpMethod.POST, "/save").permitAll()
////                .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
////                .antMatchers(HttpMethod.POST,"/api/*").permitAll()
////                .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
////                .anyRequest().authenticated();
////
////        auth.inMemoryAuthentication()
////                .withUser("sikander")
////                .password("sikander")
////                .roles("ADMIN")
////                .and()
////                .withUser("nasir")
////                .password("nasir")
////                .roles("EMPLOYEE");
//
//
//
//    }
//
////    @Override
////    public void configure(HttpSecurity http) throws Exception{
////        http.authorizeRequests()
////                .antMatchers("/api/find").hasRole("ADMIN")
////                .antMatchers("/user").hasRole("EMPLOYEE")
////              //  .antMatchers("/").permitAll()
////                .and().formLogin();
////    }
//}
