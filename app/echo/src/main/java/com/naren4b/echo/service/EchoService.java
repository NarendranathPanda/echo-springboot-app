package com.naren4b.echo.service;

import org.springframework.stereotype.Component;

@Component
public class EchoService {

	public static final String STATUS_UP = "{\"status\":\"UP\"}";

	public static long NO_OF_ECHO_COUNTER = 0;

	public String echo(String value) {
		return "{" + "\"value\": " + "\"" + value + "\"}";
	}

}
