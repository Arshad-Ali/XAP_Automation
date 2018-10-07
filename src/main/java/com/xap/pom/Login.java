package com.xap.pom;

import static com.xap.assertion.ReadPropertyFile.getpropdata;

import org.testng.annotations.Test;



import com.xap.assertion.Log;
import com.xap.base.Base;

public class Login extends Base {
	@Test
	public void test()
	{	Log.starttestcase("Test Case");
		findElement(getpropdata("username")).sendKeys("adb");
		Log.info("Testing Passs***");
		
	}

}
