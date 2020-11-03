package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BestSellerPage extends BaseClass {

	public BestSellerPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[text()='Google Play Gift Code - Digital Voucher']")
	WebElement voucher;
	
	@FindBy (xpath="//span[text()='Google Play Gift Code - Digital Voucher']")
	WebElement title;
	
	
	
	public void clickOnVoucher() {
		voucher.click();
		boolean voucherTitle=title.isDisplayed();
		System.out.println(voucherTitle);
	}

}
