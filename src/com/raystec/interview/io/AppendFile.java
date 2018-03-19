package com.raystec.interview.io;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
public static void main(String[] args) throws IOException {
	FileWriter w=new FileWriter("D:/IO_files/kanchan.txt",true);
	w.write("I am form Mhow.");
	w.close();
}
}
