package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.AmazonHomePage;
import com.pages.BookPage;

public class TestBookPage extends BaseClass {
	AmazonHomePage home;
	BookPage bookPage;

	public TestBookPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		home=new AmazonHomePage();
		home.checkSearchFunctionality(prop.getProperty("data"));
		bookPage = new BookPage();
		
	}
	
	@Test
	public void testProduct() throws IOException {
		bookPage.clickOnProduct();
		
	}

}
