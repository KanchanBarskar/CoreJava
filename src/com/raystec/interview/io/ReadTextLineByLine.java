package com.raystec.interview.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextLineByLine {
public static void main(String[] args) throws IOException {
	FileReader r=new FileReader("D:/IO_files/kanchan.txt");
	BufferedReader bf=new BufferedReader(r);
	//int ch=bf.read();
	/*char chr;
	while(ch!=-1){
		chr=(char)ch;  //type cast to character
		System.out.println(chr);
		ch=bf.read();
		
	}*/
	
	String line=bf.readLine();
	while(line!=null){
		System.out.println(line);
		line=bf.readLine();
	}
	
	bf.close();
}
}
