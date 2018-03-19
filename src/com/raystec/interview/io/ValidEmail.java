package com.raystec.interview.io;

import java.io.*;
import java.util.StringTokenizer;

public class ValidEmail {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new FileReader("D:/IO_files/t.txt"));
		
		String rejex= "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String line=in.readLine();
		while(line!=null)
		{
			StringTokenizer token=new StringTokenizer(line,",");
			while(token.hasMoreTokens())
			{
				String val=token.nextToken();
				if(val.matches(rejex))
				{
					System.out.println(val+" mail is valid");
				}
				else
				{
					System.out.println(val+" mail is not valid");
				}
			}
			line=in.readLine();
		
		}
		
	}
}
