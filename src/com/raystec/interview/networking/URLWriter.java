package com.raystec.interview.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {
public static void main(String[] args) throws IOException {
	URL u=new URL("http://www.ask.com/web");
	
	String question="Java";
	URLConnection connection=u.openConnection();
	connection.setDoOutput(true);
	
	//open output stream
	OutputStreamWriter out=new OutputStreamWriter(connection.getOutputStream());
	out.write("q="+question);
	
	out.close();
	connection.connect();
	
	InputStream is=connection.getInputStream();
	Scanner in=new Scanner(is);
	
	System.out.println("Url contents : ");
	
	while(in.hasNext()){
		String html=in.nextLine();
		System.out.println(html);
	}
	in.close();
		
		
	
	
}
}
