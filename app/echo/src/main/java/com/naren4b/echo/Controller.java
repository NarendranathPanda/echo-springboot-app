package com.naren4b.echo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naren4b.echo.service.EchoService;
import com.naren4b.echo.service.MetricService;

@RestController
public class Controller {

	private static final String HELLO = "Hello! Try echo at  <a href=\"/echo\">echo</a>";

	@Autowired
	MetricService metricSvc;

	@Autowired
	EchoService echoSvc;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE, path = "")
	public String index() {
		MetricService.SITE_VISIT_COUNTER++;
		return HELLO;
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "echo")
	public String echo(@RequestParam(name = "value", required = false, defaultValue = "{}") String value) {
		EchoService.NO_OF_ECHO_COUNTER++;
		return echoSvc.echo(value);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "healthz")
	public String healthz() {
		return EchoService.STATUS_UP;
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "metrics")
	public String metrics() throws IOException {
		return MetricService.metrics();
	}

}