package com.wz.pumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.wz.pumer.dao")
public class PumerApplication  extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) { 
		return application.sources(PumerApplication.class);
	}

	public static void main(String[] args) {
        SpringApplication.run(PumerApplication.class, args);
	}
}
