package com.raystec.interview.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
public static void main(String[] args) throws IOException {
	File f=new File("D:/IO_files/kanchan.txt");
		if(f.exists()){
		System.out.println("File Name : "+f.getName());  //name of file
		System.out.println("Path : "+f.getAbsolutePath());  //path of file
		System.out.println("Writable "+f.canWrite());
		System.out.println("Readable "+f.canRead());
		System.out.println("Executable "+f.canExecute());
		System.out.println("Is file : "+f.isFile());
		System.out.println("Is directory : "+f.isDirectory());
		
		Date d=new Date(f.lastModified());
		System.out.println("Last modified : "+d);
		System.out.println("length of file : "+f.length());
		
		
	}else{
		System.out.println("File does not exist");
	}
		System.out.println("******************");
		
		//returns the list of directory and files
		
		File directory = new File("D:/my folder");
		String[] files=directory.list();
		for(String file:files){
			System.out.println(file);
		}
		
		
		System.out.println("********************");
		
		//Create a subdirectory
		
		File subDir=new File("D:/IO_files","text");
		subDir.mkdir();
		
		subDir.renameTo(new File("D:/IO_files","folder"));
		
		//System.out.println(f.delete());
		//f.deleteOnExit();
}
}
