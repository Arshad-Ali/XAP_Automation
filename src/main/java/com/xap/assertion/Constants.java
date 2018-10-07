package com.xap.assertion;

/**
 * @author Arshad Ali constant class is to keep all paths and sheet names
 *
 */
public interface Constants {
	String root 			= System.getProperty("user.dir");
	String resource  	    = root+"//resource";
	String ExecutionInfo	= root+"//ExecutionInfo";
	String config       	= resource+"//config//"+"Config.properties";
	String objectrepo   	= resource+"//Repository//"+"ObjectRepo.properties";
	String logxml       	= resource+"//log.xml";
	String driver       	= System.getProperty("user.dir")+"//drivers";
	String chromedriver 	= driver+"//chromedriver.exe";
	String InputTestData	= ExecutionInfo+"//InputTestData";
	String logs				= ExecutionInfo+"//logs";
}
