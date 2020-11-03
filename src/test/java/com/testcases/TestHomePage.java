package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.AmazonHomePage;
import com.pages.BookPage;

public class TestHomePage extends BaseClass {
	AmazonHomePage home;
	BookPage bookPage;

	public TestHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException {
		initialization();
		home=new AmazonHomePage();
		bookPage = new BookPage();
		
	}
	
//	@Test(priority=1)
//	public void testLogo() {
//		home.validateLogo();
//	}
//	
//	@Test
//	public void clickSlide() throws InterruptedException, IOException {
//		home.clickOnSeller();
//	}
	
//	@Test
//	public void validateTextDisplay() {
//		home.verifyText();
//	}
//	@Test
//	public void testHoverOnSigIn() throws InterruptedException, IOException {
//		home.hooverOnsignIn();
//	}
	
	@Test
	public void searchFunctionality() throws InterruptedException, IOException {
		home.checkSearchFunctionality(prop.getProperty("data"));
	}

}
