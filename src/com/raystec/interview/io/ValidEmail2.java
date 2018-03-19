package com.raystec.interview.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ValidEmail2 {
public static void main(String[] args) throws IOException {
	BufferedReader r=new BufferedReader(new FileReader("D:/IO_files/t.txt"));
	String regx="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String line=r.readLine();
	while(line!=null){
		StringTokenizer token=new StringTokenizer(line);
		while(token.hasMoreTokens()){
		String val=token.nextToken();
		if(val.matches(regx)){
			System.out.println(val+" is valid email");
		}else{
			System.out.println(val+" is not valid email");
		}
		
		}
		line=r.readLine();
	}
}
}
