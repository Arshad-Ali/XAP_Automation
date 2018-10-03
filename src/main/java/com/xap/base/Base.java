package com.xap.base;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.xap.assertion.Constants;
import com.xap.assertion.Factory;
import com.xap.assertion.ObjectIdentification;

import static com.xap.assertion.ReadPropertyFile.*;

public class Base{
Properties prop=readProperty(Constants.objectrepo);
Properties prop1=readProperty(Constants.config);

@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aali2\\git\\XAP_Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://intranet.xavient.com/XAP/");
	String st1=getpropdata("username");
	System.out.println(st1);
	//driver.findElement(By.xpath("//*[@id='txtLoginName']")).sendKeys("adb");
	driver.findElement(ObjectIdentification.by(st1)).sendKeys("adb");
	/*String st1=getpropdata("username");
	String st2=getpropdata("Login");
	System.out.println("String 1: "+st1+" String 2: "+st2);*/
}
}
