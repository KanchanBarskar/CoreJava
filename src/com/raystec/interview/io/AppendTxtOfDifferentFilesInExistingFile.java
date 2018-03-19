package com.raystec.interview.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendTxtOfDifferentFilesInExistingFile {
public static void main(String[] args) throws IOException {

	PrintWriter w=new PrintWriter(new FileWriter("D:/IO_files/large.txt",true));
	
	BufferedReader br=new BufferedReader(new FileReader("D:/IO_files/a.txt"));
	String line=br.readLine();
	while(line!=null){
		w.println(line);
		line=br.readLine();
	}
	
	BufferedReader br1=new BufferedReader(new FileReader("D:/IO_files/b.txt"));
	String line1=br1.readLine();
	while(line1!=null){
		w.println(line1);
		line1=br1.readLine();
	}
	
	BufferedReader br2=new BufferedReader(new FileReader("D:/IO_files/c.txt"));
	String line2=br2.readLine();
	while(line2!=null){
		w.println(line2);
		line2=br2.readLine();
	}
	
	BufferedReader br3=new BufferedReader(new FileReader("D:/IO_files/d.txt"));
	String line3=br3.readLine();
	while(line3!=null){
		w.println(line3);
		line3=br3.readLine();
	}
	
	br3.close();
	br2.close();
	br1.close();
	br.close();
	w.close();
}
}
