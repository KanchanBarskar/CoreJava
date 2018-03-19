package com.raystec.interview.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {
	Student s1=new Student();
	s1.setId(1);
	s1.setName("Kanchan");
	System.out.println(s1.getId()+" "+s1.getName());
	
	Student s2=(Student) Class.forName("com.raystec.interview.basic.Student").newInstance();
	//Student s2=Student.class.newInstance();
	s2.setId(2);
	s2.setName("Rahul");
	System.out.println(s2.getId()+" "+s2.getName());
	
	Constructor<Student> constructor=Student.class.getConstructor();
	Student s3=constructor.newInstance();
	s3.setId(3);
	s3.setName("Ritesh");
	System.out.println(s3.getId()+" "+s3.getName());
	
	Student obj=new Student();
	Student s4=(Student) obj.clone();
	s4.setId(4);
	s4.setName("Riyansh");
	System.out.println(s4.getId()+" "+s4.getName());
	
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:/Student.ser"));
	out.writeObject(s4);
	out.close();
	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/Student.ser"));
	Student s5=(Student) in.readObject();
	s5.setId(5);
	s5.setName("Rashi");
	System.out.println(s5.getId()+" "+s5.getName());
	in.close();
	
}
}
