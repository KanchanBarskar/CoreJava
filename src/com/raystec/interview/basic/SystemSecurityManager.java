package com.raystec.interview.basic;

public class SystemSecurityManager {
public static void main(String[] args) {
	SecurityManager scManager=System.getSecurityManager();
	if(scManager==null){
		System.out.println("Security MAnager is not configured");
	}
	
	scManager=new SecurityManager();
	System.setSecurityManager(scManager);
	
	scManager=System.getSecurityManager();
	if(scManager!=null){
		System.out.println("Security MAnager is configured");
	}
	
}
}
