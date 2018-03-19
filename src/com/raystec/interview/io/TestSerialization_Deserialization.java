package com.raystec.interview.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization_Deserialization {
public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
	
	Marksheet m=new Marksheet();
	m.setName("Kanchan Barskar");
	m.setPhysics(78);
	m.setChemistry(89);
	m.setMaths(98);
	
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:/IO_files/object.ser"));
	out.writeObject(m);
	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/IO_files/object.ser"));
	Marksheet m1=(Marksheet) in.readObject();
	System.out.println(m1.getName());
	System.out.println(m1.getChemistry());
	System.out.println(m1.getPhysics());
	System.out.println(m1.getMaths());
	System.out.println(m1.getTotal());
	System.out.println(m1.getPercentage());
	
}
}
