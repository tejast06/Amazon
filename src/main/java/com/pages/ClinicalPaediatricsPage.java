package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ClinicalPaediatricsPage extends BaseClass {

	public ClinicalPaediatricsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//select[@id='quantity']//option[text()=2]")
	WebElement dropdown;
	
	

}
