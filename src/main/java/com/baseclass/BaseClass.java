package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() throws IOException {
		prop=new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Tejas Toley\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\utility\\config.properties");
		prop.load(ip);
	}
	
	public static void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
