package com.xap.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class FindElement{
	public WebDriver driver=null;
	public FindElement(WebDriver driver)
	{
		this.driver=driver;
	}
	
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
	public WebElement getelement(String element)
	{
	WebElement ele=driver.findElement(by(element));
	System.out.println("element txt in findele: "+ele.getAttribute("placeholder"));
	return ele;
	}
}
