package com.xap.assertion;

import org.openqa.selenium.By;

public class ObjectIdentification {

	public static By by(String object)
	{
		String str[]=object.split(">");
		String locator=str[0].toUpperCase();
		System.out.println("str[0]:"+str[0]+" and str[1]: "+str[1]);
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
	return null;
	}
}
