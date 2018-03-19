package com.raystec.interview.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws IOException {
		URL u=new URL("http://www.raystec.com/Home/training");
		
		System.out.println("Protocol : "+u.getProtocol());
		System.out.println("Port : "+u.getPort());
		System.out.println("Host : "+u.getHost());
		System.out.println("File Name : "+u.getFile());
		
		System.out.println("***********************************");
		
		InputStream is=u.openStream();
		Scanner in=new Scanner(is);
		
		while(in.hasNext()){
			String html=in.nextLine();
			System.out.println(html);
		}
		in.close();
		
	}
}
