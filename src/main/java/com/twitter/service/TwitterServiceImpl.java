package com.twitter.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class TwitterServiceImpl implements TwitterUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(TwitterServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Value("${external.api.url}")
	private String TwitterApiUrl;

	@Override
	public String getAllUser() {
		String usersList = restTemplate.getForObject(TwitterApiUrl + "users", String.class);
		logger.info("Getting list of all Users: {}", usersList);
		return usersList;
	}

	@Override
	public String getAllUserByName(String id) {

		String user = restTemplate.getForObject(TwitterApiUrl + "users/" + id, String.class);
		logger.info("Getting user by ID: {}", user);
		System.out.println(user.getClass().getSimpleName());

		return user;
	}

}
