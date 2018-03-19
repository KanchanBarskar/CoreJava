package com.raystec.interview.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharStreamFromFile {
public static void main(String[] args) throws IOException {
	FileReader reader=new FileReader("D:/IO_files/kanchan.txt");  //open a file
	int ch=reader.read();  //read a character as ASCII or Unicode
	char chr;
	while(ch!=-1){
		chr=(char)ch;  //type cast to character
		System.out.println(chr);
		ch=reader.read();
		
	}
	reader.close();
}
}
