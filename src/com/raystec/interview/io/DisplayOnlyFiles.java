package com.raystec.interview.io;

import java.io.File;

public class DisplayOnlyFiles {
public static void main(String[] args) {
	
	File directory=new File("C:/temp");
	String[] list=directory.list();
	for (int i = 0; i < list.length; i++) {
		File f=new File("C:/temp",list[i]);
		if(f.isFile()){
			System.out.println(list[i]);
		}
	}
	
}
}
