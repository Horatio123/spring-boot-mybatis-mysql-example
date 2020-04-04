package com.techprimers.mybatis.springbootmybatis.config;

import com.techprimers.mybatis.springbootmybatis.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public Dog dog() {
        return new Dog();
    }
}
