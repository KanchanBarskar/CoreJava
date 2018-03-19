package com.raystec.interview.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTxtUsingPrintWriter {
public static void main(String[] args) throws IOException {
	FileWriter w=new FileWriter("D:/IO_files/kanchan.txt",true);
	PrintWriter pw=new PrintWriter(w);
	pw.write("I have two younger brothers");
	pw.println("I am Kanchan Barskar");
	pw.println("I am form Mhow");
	pw.close();
	w.close();
}
}
