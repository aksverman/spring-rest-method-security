package com.rudra.aks.init;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import com.rudra.aks.fluentd.logger.InitRunner;


@SpringBootApplication(scanBasePackages = "com.rudra.aks")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class RestSecurityBootApp {

	public static void main(String args[]) throws Exception {
		//SpringApplication.run(HttpSessionConfig.class, args);
		InitRunner.run(RestSecurityBootApp.class, args);
	}
}
