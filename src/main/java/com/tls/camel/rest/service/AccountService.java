package com.tls.camel.rest.service;

import org.springframework.stereotype.Service;

import com.tls.camel.rest.dao.Account;

@Service
public class AccountService {

	public Account getAccountDetails()
	{
		
		Account acc=new Account();
		acc.setCaller_id("1234");
		acc.setAgent_number("789965");
		acc.setCustomer_number("8897792889");
		acc.setK_number("897654");
		
		return acc;
		
	}
	
	
}
