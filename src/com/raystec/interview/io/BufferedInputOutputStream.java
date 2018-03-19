package com.raystec.interview.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStream {
public static void main(String[] args) throws IOException {
	BufferedInputStream in=new BufferedInputStream(new FileInputStream("D:/krishna.jpg"));
	BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("D:/IO_files/krishna.jpg"));
	byte[] buff=new byte[256];
	int count=in.read(buff);
	
	while(count>0){
		out.write(buff, 0, count);
		count=in.read(buff);
	}
	out.close();
	in.close();
}
}
