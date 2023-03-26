package com.twitter.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.client.RestTemplate;

@Configuration
public class TwitterConfiguration {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
		
	}
//
//    @Value("${twitter.consumer.key}")
//    private String consumerKey;
//
//    @Value("${twitter.consumer.secret}")
//    private String consumerSecret;
//
//    @Value("${twitter.access.token}")
//    private String accessToken;
//
//    @Value("${twitter.access.token.secret}")
//    private String accessTokenSecret;
//
//    @Bean
//    public Twitter twitter() {
//        return new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
 //  }

}