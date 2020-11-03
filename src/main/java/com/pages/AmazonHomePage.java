package com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class AmazonHomePage extends BaseClass {

	public AmazonHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@id='nav-logo-sprites']")
	WebElement logo;
	
	@FindBy (xpath="//a[text()='Best Sellers']")
	WebElement seller;
	
	@FindBy (xpath="//div[text()='Amazon Bestsellers']")
	WebElement text;
	
	@FindBy (xpath="//span[text()='Hello, Sign in']")
	WebElement newCustomer;
	
	@FindBy (xpath="//div[@id='nav-flyout-ya-newCust']//a[text()='Start here.']")
	WebElement customerPage;
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBar;
	
	@FindBy (xpath="//span[@id='nav-search-submit-text']//input[@class='nav-input']")
	WebElement searchBtn;
	
	@FindBy (xpath="//span[text()='Featured']")
	WebElement feature;
	
	@FindBy (xpath="//div[@class='a-popover-wrapper']//ul//li//a[text()='Price: High to Low']")
	WebElement highToLow;
	
	public BookPage checkSearchFunctionality(String data) throws InterruptedException, IOException {
		searchBar.click();
	    searchBar.sendKeys(data);
		searchBtn.click();
		Thread.sleep(3000);
		feature.click();
		highToLow.click();
		return new BookPage();
		
		
	}
	
//	public void validateLogo() {
//		boolean name=logo.isDisplayed();
//		System.out.println(name);
//	}
//	
//	public BestSellerPage clickOnSeller() throws InterruptedException, IOException {
//		seller.click();
//		Thread.sleep(4000);
//		
//		return new BestSellerPage();
//		
//	}
//	
//	public NewCustomer hooverOnsignIn() throws InterruptedException, IOException {
//		Actions action = new Actions(driver);
//		action.moveToElement(newCustomer).build().perform();
//		Thread.sleep(2000);
//		customerPage.click();
//		return new NewCustomer();
//	}
//	
//	
//	
//	public void verifyText() {
//		boolean verifyText=text.isDisplayed();
//		System.out.println(verifyText);
//	}
	
	
	
	
	
	

}
