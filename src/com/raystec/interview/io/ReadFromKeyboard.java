package com.raystec.interview.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
public static void main(String[] args) throws IOException {
	PrintWriter out=new PrintWriter(new FileWriter("D:/IO_files/a.txt"));

	InputStreamReader kb=new InputStreamReader(System.in);
	System.out.println("Enter a line");
	BufferedReader in=new BufferedReader(kb);
	String line=in.readLine();
	while(!line.equals("quit")){
		out.println(line);
		line=in.readLine();
	}
	
	in.close();kb.close();out.close();
}
}
