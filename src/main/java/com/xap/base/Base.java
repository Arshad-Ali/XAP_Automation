package com.xap.base;

import java.util.Properties;

import org.testng.annotations.Test;

import com.xap.assertion.Constants;
import com.xap.assertion.ReadPropertyFile;

public class Base {
Properties prop=ReadPropertyFile.readProperty(Constants.config);
public void getpropdata()
{
	String data=prop.getProperty("password");
	System.out.println(data);
}
@Test
public void test()
{
	getpropdata();
}
}
