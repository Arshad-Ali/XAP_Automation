package com.xap.base;

import java.util.Properties;

import org.testng.annotations.Test;

import com.xap.assertion.Constants;
import static com.xap.assertion.ReadPropertyFile.*;

public class Base {
Properties prop=readProperty(Constants.objectrepo);
Properties prop1=readProperty(Constants.config);

@Test
public void test()
{
	String st1=getpropdata("username");
	String st2=getpropdata("Login");
	System.out.println("String 1: "+st1+" String 2: "+st2);
}
}
