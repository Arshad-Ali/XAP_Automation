package com.xap.assertion;

import org.openqa.selenium.By;

public class ObjectIdentification {

	public static By by(String object)
	{
		String str[]=object.split(">");
		String locator=str[1].toUpperCase();
	switch(locator)	
	{
	case "XPATH": 
		return By.xpath(str[2]);
	case "CLASS": 
		return By.className(str[2]);
	case "CSSSELECTOR": 
		return By.cssSelector(str[2]);
	case "ID":
		return By.id(str[2]);
	case "LINKTEXT": 
		return By.linkText(str[2]);
	case "PARTIALLINKTEXT": 
		return By.partialLinkText(str[2]);
	case "NAME": 
		return By.name(str[2]);
	case "TAGNAME":
		return By.tagName(str[2]);		
			}
	return null;
	}
}
