package com.raystec.interview.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTxtUsingBufferedWriter {
public static void main(String[] args) throws IOException {
	FileWriter w=new FileWriter("D:/IO_files/kanchan.txt",true);
	BufferedWriter bw=new BufferedWriter(w);
	char[] cArray={'H','i'};
	bw.write(cArray);
	bw.write(',');
	bw.write("I am so happy");
	bw.close();
	w.close();
}
}
