package com.xap.base;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xap.assertion.Constants;
import com.xap.assertion.Factory;
import com.xap.assertion.FindElement;

import static com.xap.assertion.ReadPropertyFile.*;

public class Base{
Properties prop=readProperty(Constants.objectrepo);
Properties prop1=readProperty(Constants.config);
public FindElement find=null;
public WebDriver driver=null;

public WebDriver getdriver()
{
	return driver;
}
@BeforeClass
public void beforeclass()
{
	System.setProperty("webdriver.chrome.driver",Constants.chromedriver);
	driver=new ChromeDriver();
	driver.get("https://intranet.xavient.com/XAP/");
	find=new FindElement(driver);
	
}
}
