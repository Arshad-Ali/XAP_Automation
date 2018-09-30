package com.xap.assertion;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadPropertyFile {
	static Properties prop;
	public static Properties readProperty(String filename) {
		/*** Take property file name and Initialize it to read**/
		File propfile=new File(filename);
		try {
			FileInputStream fin=new FileInputStream(propfile);
			prop= Factory.getpropobject();
			prop.load(fin);
		} catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
