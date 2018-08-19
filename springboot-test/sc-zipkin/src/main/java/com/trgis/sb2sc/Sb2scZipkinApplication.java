package com.trgis.sb2sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class Sb2scZipkinApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sb2scZipkinApplication.class, args);
	}
}
