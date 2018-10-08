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
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;



public class Log {
	//Initialized log4j
	private static Logger log;
	static FileAppender appender;
	
	//To print Beginning of the test case.
	
	public static Logger initLogs(String append) {
		FileAppender appender = new FileAppender();
		// configure the appender here, with file location, etc
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String getdate=dateFormat.format(date); //2016-11-16		
		String filename="//"+append+getdate;
		
		appender.setFile(Constants.logs+ filename + ".log");
		appender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m %n"));
		appender.setAppend(true);
		appender.setBufferSize(100);
		appender.activateOptions();
		
		Logger APPLICATION_LOG = Logger.getLogger(append);
		APPLICATION_LOG.setLevel(Level.DEBUG);
		APPLICATION_LOG.addAppender(appender);
		
		
		return APPLICATION_LOG;
	}
	public static void starttestcase(String Testccasename) 
	{
	//layout(Testccasename);
		log=initLogs(Testccasename);
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
