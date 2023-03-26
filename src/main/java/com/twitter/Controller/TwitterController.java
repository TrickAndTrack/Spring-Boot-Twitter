package com.twitter.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.twitter.service.TwitterUserService;

@RestController
@RequestMapping("/api")
public class TwitterController {

	@Autowired
	private TwitterUserService twitterUserService;
	
	private static final Logger logger = LoggerFactory.getLogger(TwitterController.class);
	


//	@GetMapping("/users")
//	public String getAllUsers() {
//
//			String resposne = twitterUserService.getAllUser();
//			
//			return resposne;
//		
//
//	}
	
	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() {

		try {
			String resposne = twitterUserService.getAllUser();
			return new ResponseEntity<>(resposne, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}


	@GetMapping("/{id}")
	public ResponseEntity<?> getAllUserByName(@PathVariable String id) {

		try {
			String resposne = twitterUserService.getAllUserByName(id);
			return new ResponseEntity<>(resposne, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




}