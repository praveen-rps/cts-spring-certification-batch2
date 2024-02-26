package com.examples.springcoredemo.model;

import org.springframework.stereotype.Component;

//@Component("mysql")
public class DbConnectionsImpl implements DbConnections {

	@Override
	public String getDriver() {
		// TODO Auto-generated method stub
		return "MySQL Driver is used";
	}

	@Override
	public String getDatabase() {
		// TODO Auto-generated method stub
		return "MySQL database is used";
	}

}
