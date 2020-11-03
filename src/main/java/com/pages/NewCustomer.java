package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class NewCustomer extends BaseClass {

	public NewCustomer() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@name='customerName']")
	WebElement name;
	
	@FindBy (xpath="//input[@placeholder='Mobile number']")
	WebElement mobileNumber;
	
	@FindBy (xpath="//input[@id='ap_email']")
	WebElement emailId;
	
	@FindBy (xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy (xpath="//input[@id='continue']")
	WebElement btn;
	
	public void enterData(String userName, String string, String email, String pwd) {
		name.sendKeys(userName);
		mobileNumber.sendKeys(string);
		emailId.sendKeys(email);
		password.sendKeys(pwd);
		btn.click();
		}

}
