package com.javadoterr.api.service;

import org.springframework.stereotype.Service;

@Service
public class CustomLogService {

	public String convertAndSend(String message) {
		System.out.println("-------> " + message + " <-------");

		return "message queued for processing...";
	}

}
