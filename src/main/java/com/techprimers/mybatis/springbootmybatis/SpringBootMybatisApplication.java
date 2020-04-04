package com.techprimers.mybatis.springbootmybatis;

import com.techprimers.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@MappedTypes(Users.class)
@MapperScan("com.techprimers.mybatis.springbootmybatis.mapper")
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}
}
