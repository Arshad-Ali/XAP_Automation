package com.xap.pom;

import static com.xap.assertion.ReadPropertyFile.getpropdata;

import org.testng.annotations.Test;


import com.xap.base.Base;

public class Login extends Base {
	@Test
	public void test()
	{
		getelement(getpropdata("username")).sendKeys("adb");
		
	}

}
