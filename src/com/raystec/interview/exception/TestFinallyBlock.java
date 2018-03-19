package com.raystec.interview.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFinallyBlock {
public static void main(String[] args) throws IOException {
	InputStream input=null;
	
	try{
		input=new FileInputStream("D:/file.txt");
		int data=input.read();
		while(data!=-1){
			System.out.print((char)data);
			data=input.read();
		}
	}finally{
		if(input!=null){
			input.close();
		}
		
	}
}
}
