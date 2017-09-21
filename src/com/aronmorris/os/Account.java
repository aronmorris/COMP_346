package com.aronmorris.os;

import java.util.HashMap;

public class Account {

	private HashMap<String, Integer> accounts;
	
	private int PIN;
	
	private String userName;
	
	private Account() {
		accounts = new HashMap<String, Integer>();
		accounts.put("Checking", 0);
		accounts.put("Savings", 0);
	}
	
	public Account createAccount(String name, int PIN) {
		
		this.userName = name;
		this.PIN = PIN;
		
		return new Account();
	}
	
}
