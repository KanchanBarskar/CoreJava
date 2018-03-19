package com.raystec.interview.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharStreamToFile {
public static void main(String[] args) throws IOException {
	FileWriter w=new FileWriter("D:/IO_files/kanchan.txt");
	char[] cArray={'H','e','l','l','o','w'};
	
	w.write(cArray);  //write char array
	w.write(',');  //write character
	w.write("I am Kanchan.");  //write string
	w.close();
}
}
