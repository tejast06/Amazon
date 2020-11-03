package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.AmazonHomePage;
import com.pages.NewCustomer;

public class TestNewCustomerPage extends BaseClass {
	AmazonHomePage home;
	NewCustomer customer;

	public TestNewCustomerPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		home=new AmazonHomePage();
		//customer=home.hooverOnsignIn();
	}
	
	@Test
	public void entersData() {
		customer.enterData(prop.getProperty("username"), prop.getProperty("number"), prop.getProperty("email"), prop.getProperty("password"));
		
	}

}
