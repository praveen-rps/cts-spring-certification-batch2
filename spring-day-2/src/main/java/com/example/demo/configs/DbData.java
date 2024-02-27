package com.example.demo.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbData {
	
	@Value("${uname}") // env.getProperty("uname");
	String uname;
	@Value("${password}")
	String password;
	@Value("${driver}")
	String driver;
	@Value("${dbname}")
	String dbname;
	public DbData() {
	
	
	}
	
	public DbData(String uname, String password, String driver, String dbname) {
		super();
		this.uname = uname;
		this.password = password;
		this.driver = driver;
		this.dbname = dbname;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	
	

}
