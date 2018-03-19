package com.raystec.interview.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
public static void main(String[] args) throws IOException {
	DataOutputStream out=new DataOutputStream(new FileOutputStream("D:/IO_files/binary.dat"));
	out.writeInt(1);
	out.writeChar('a');
	out.writeBoolean(true);
	out.writeDouble(45.7);
	out.writeLong(56L);
	out.close();
	
	
}
}
