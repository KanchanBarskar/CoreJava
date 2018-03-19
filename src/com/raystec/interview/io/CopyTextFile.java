package com.raystec.interview.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
public static void main(String[] args) throws IOException {
	FileReader r=new FileReader("D:/IO_files/a.txt");
	FileWriter w=new FileWriter("D:/IO_files/e.txt");
	
	int ch=r.read();
	while(ch!=-1){
		char chr=(char)ch;
		w.write(chr);
		ch=r.read();
	}
	
	/*BufferedReader br=new BufferedReader(r);
	BufferedWriter bw=new BufferedWriter(w);
	
	String line=br.readLine();
	while(line!=null){
		bw.write(line);
		line=br.readLine();
	}
	bw.close();
	br.close();*/
	r.close();
	w.close();
	
}
}
