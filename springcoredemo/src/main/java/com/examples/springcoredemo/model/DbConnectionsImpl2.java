package com.examples.springcoredemo.model;

import org.springframework.stereotype.Component;

@Component("orcl")
public class DbConnectionsImpl2 implements DbConnections {

	@Override
	public String getDriver() {
		// TODO Auto-generated method stub
		return "Oracle driver";
	}

	@Override
	public String getDatabase() {
		// TODO Auto-generated method stub
		return "Oracle Database is used";
	}

}
