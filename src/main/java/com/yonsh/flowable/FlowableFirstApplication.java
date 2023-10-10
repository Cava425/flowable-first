package com.yonsh.flowable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class FlowableFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowableFirstApplication.class, args);
	}

}
