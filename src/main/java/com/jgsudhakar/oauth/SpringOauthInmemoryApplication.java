package com.jgsudhakar.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author sudhakar.t
 *
 */
@SpringBootApplication
@EnableAuthorizationServer
public class SpringOauthInmemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthInmemoryApplication.class, args);
	}

}
