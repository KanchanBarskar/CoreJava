package com.raystec.interview.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryData_Image {
public static void main(String[] args) throws IOException {
	String source="D:/divya.jpg";
	String target="D:/IO_files/divya.jpg";
	FileInputStream in=new FileInputStream(source);
	FileOutputStream out=new FileOutputStream(target);
	int ch=in.read();
	while(ch!=-1){
		out.write(ch);
		ch=in.read();
	}
	
	in.close();
	out.close();
}
}
