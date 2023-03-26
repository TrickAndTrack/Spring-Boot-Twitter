package com.twitter.service;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public interface TwitterUserService {

	
	public String  getAllUser();
	
//	public String getAllUserByName();
	public String getAllUserByName(String id );
	
}
