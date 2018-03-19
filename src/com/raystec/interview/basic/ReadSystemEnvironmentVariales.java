package com.raystec.interview.basic;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadSystemEnvironmentVariales {
public static void main(String[] args) {
	//get single environment variable
	String path=System.getenv("PATH");
	System.out.println("$PATH = "+path);
	System.out.println("****************************");
	//read all environment variables
	Map<String, String> envMAP=System.getenv();
	Set<String> keySet=envMAP.keySet();
	for(String key:keySet){
		String value=envMAP.get(key);
		System.out.println(key +"= "+value);
	}
	System.out.println("****************************");
	//get all System defined properties
	Properties property=System.getProperties();
	Set<Object> keySets=property.keySet();
	for(Object obj:keySets){
		String key=(String) obj;
		String value=property.getProperty(key);
		System.out.println(key+" = "+value);
	}
	System.out.println("******************************");
	
	//clear System property
	System.clearProperty("user.country");
	//get specific propertyi
	String country=System.getProperty("user.country");
	System.out.println("user.country = "+country);
	
	//set System property
	System.setProperty("user.country", "IN");
	String country1=System.getProperty("user.country");
	System.out.println("user.country = "+country1);
}
}
