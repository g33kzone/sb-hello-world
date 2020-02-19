package com.g33kzone.helloworld.component;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "readiness")
@Component
public class Readiness {

	@ReadOperation
	public String testReadiness() {
		return "{\"status\":\"UP\"}";
	}
}
