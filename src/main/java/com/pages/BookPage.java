package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookPage extends BaseClass {

	public BookPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='a-section a-spacing-none s-result-item s-flex-full-width s-widget']//span//div[@data-asin='9351296520']")
	WebElement clickOnBook;
	
	public ClinicalPaediatricsPage clickOnProduct() throws IOException {
		clickOnBook.click();
		return new ClinicalPaediatricsPage();
	}
	
	

}
