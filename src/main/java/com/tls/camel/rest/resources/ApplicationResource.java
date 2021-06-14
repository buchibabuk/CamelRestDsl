package com.tls.camel.rest.resources;



import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.tls.camel.rest.dao.Account;
import com.tls.camel.rest.service.AccountService;
@Component
public class ApplicationResource extends RouteBuilder {

	@Autowired
	AccountService accountservice;
	public void configure() throws Exception
	{
		restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
		//rest().get("/helloworld").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(constant("WELCOME TO FUSE REST EXAMPLE"));
	
	rest().get("/getAccountDetails").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(()->accountservice.getAccountDetails());
	
	}
}
