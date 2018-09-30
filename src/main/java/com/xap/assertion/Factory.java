package com.xap.assertion;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Factory {
	static Map<String,Object> map=new HashMap<String,Object>();
	public static Properties getpropobject()
	{
		if(map.containsKey("propertyobject"))
			return (Properties) map.get("propertyobject");
		else
		{
			map.put("propertyobject", new Properties());
		}
		return (Properties) map.get("propertyobject");
	}
	

}
