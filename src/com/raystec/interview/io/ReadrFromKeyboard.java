package com.raystec.interview.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadrFromKeyboard {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter characters here");
	
	BufferedWriter w=new BufferedWriter(new FileWriter("D:/IO_files/s.txt"));
	String line=sc.nextLine();
	while(!line.equals("quit")){
		
		w.write(line);
		line=sc.nextLine();
	}
	
	sc.close();
	w.close();
}
}
