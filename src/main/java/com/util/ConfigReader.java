package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	/* 
	 * This method is used to load config.properties file
	 * It return properties prop object
	 */
	public Properties init_prop()
	{
		prop= new Properties();
		
	try {
		FileInputStream ip= new FileInputStream("C:\\Users\\Archana M\\eclipse-workspace\\storeManger_New\\src\\test\\resources\\config\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return prop;
	
	}

}
