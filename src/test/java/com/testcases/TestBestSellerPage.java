package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.AmazonHomePage;
import com.pages.BestSellerPage;

public class TestBestSellerPage extends BaseClass {
	AmazonHomePage home;
	BestSellerPage page;

	public TestBestSellerPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		home = new AmazonHomePage();
		page = new BestSellerPage();
		//home.clickOnSeller();
		
	}
	
	@Test
	public void testVoucher() {
		page.clickOnVoucher();
		
	}

}
