package com.raystec.interview.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {
public static void main(String[] args) throws IOException {
	DataInputStream in=new DataInputStream(new FileInputStream("D:/IO_files/binary.dat"));
	System.out.println(in.readInt());
	System.out.println(in.readBoolean());
	System.out.println(in.readLong());
	System.out.println(in.readDouble());
}
}
