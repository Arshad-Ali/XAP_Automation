package com.xap.assertion;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class Log {
	//Initialized log4j
	private static Logger log;
	
	//To print Beginning of the test case.
	public static void layout(String testcase)
	{
		SimpleLayout layout = new SimpleLayout();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String getdate=dateFormat.format(date); //2016-11-16		
		String filename="//"+testcase+getdate+".txt";
		Path path = FileSystems.getDefault().getPath(Constants.logs, filename);
		
	   try {
	    	if(Files.notExists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}))
	    	{
	    		path = Paths.get(Constants.logs+filename);
	    	}
			FileAppender appender = new FileAppender(layout,Constants.logs+filename,true);
			System.setProperty("my.log", Constants.logs);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void starttestcase(String Testccasename) 
	{
	layout(Testccasename);
	log=Logger.getLogger(Testccasename);
	
	log.info("/**********  Starting the test case **********/");
	log.info("--$$$$$$$$$  "+Testccasename+ "  $$$$$$$$$--");
	
	}

	
	//End the TESTCASE	
	public static void endtestcase(String Testccasename)
	{
	log.info("/**********  Ending the test case **********/");
	log.info("--$$$$$$$$$  "+Testccasename+ "  $$$$$$$$$--");
	}
	//Debug Method
		public static void debug(String msg)
		{
			log.debug(msg);
		}
		//Error Method
		public static void error(String msg)
		{
			log.error(msg);
		}
	
	//Info Method
	public static void info(String msg)
	{
		log.info(msg);
	}
	//trace Method
		public static void trace(String msg)
		{
			log.trace(msg);
		}
		
		//Warn Method
		public static void warn(String msg)
		{
			log.warn(msg);
		}

}
