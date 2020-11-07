package com.naren4b.echo.service;

import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class MetricService {
	public static long SITE_VISIT_COUNTER = 0;

	public static String metrics() throws IOException {

		return "{" + "\"SITE_VISIT_COUNTER\": " + "\"" + SITE_VISIT_COUNTER + "\" ," + "\"NO_OF_ECHO_COUNTER\": " + "\""
				+ EchoService.NO_OF_ECHO_COUNTER + "\" " + "}";

	}

	private MetricService() {
	}

}
