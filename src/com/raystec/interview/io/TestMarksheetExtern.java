package com.raystec.interview.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMarksheetExtern {
public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
	MarksheetExtern m=new MarksheetExtern();
	m.setName("Kanchan Basrkar");
	m.setPhysics(78);
	m.setChemistry(78);
	m.setMaths(78);
	m.setTemp(89);
	
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:/IO_files/objectEx.ser"));
	m.writeExternal(out);
	out.close();
	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/IO_files/objectEx.ser"));
	MarksheetExtern m1=new MarksheetExtern();
	m1.readExternal(in);
	System.out.println(m1.getName());
	System.out.println(m1.getPhysics());
	System.out.println(m1.getChemistry());
	System.out.println(m1.getMaths());
	System.out.println(m1.getTemp());
	in.close();
	
	
}
}
