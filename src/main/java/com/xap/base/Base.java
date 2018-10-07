package com.xap.base;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


import com.xap.assertion.Constants;



import static com.xap.assertion.ReadPropertyFile.*;

public class Base{
Properties prop=readProperty(Constants.objectrepo);
Properties prop1=readProperty(Constants.config);

public WebDriver driver=null;

public WebDriver getdriver()
{
	return driver;
}

/*******Find element methods************/
private By by(String object)
{
	String str[]=object.split(">");
	String locator=str[0].toUpperCase();
	System.out.println("str[0]:"+str[0]+" and str[1]: "+str[1]);
	try{
switch(locator)	
{
case "XPATH": 
	return By.xpath(str[1]);
case "CLASS": 
	return By.className(str[1]);
case "CSSSELECTOR": 
	return By.cssSelector(str[1]);
case "ID":
	return By.id(str[1]);
case "LINKTEXT": 
	return By.linkText(str[1]);
case "PARTIALLINKTEXT": 
	return By.partialLinkText(str[1]);
case "NAME": 
	return By.name(str[1]);
case "TAGNAME":
	return By.tagName(str[1]);		
		}
	}
	catch(Exception e)
	{
		System.out.println("Elemend identifier not exist");
	}
	return null;
}

public WebElement findElement(String element)
{
WebElement ele=driver.findElement(by(element));
return ele;
}

public List<WebElement> findElements(String element)
{
List<WebElement> listelement=driver.findElements(by(element));
return listelement;
}
/********************End of Find Elements Methods*************/


@BeforeClass
public void beforeclass()
{
	DOMConfigurator.configure(Constants.logxml);
	System.setProperty("webdriver.chrome.driver",Constants.chromedriver);
	driver=new ChromeDriver();
	driver.get("https://intranet.xavient.com/XAP/");
	
	
}
}
