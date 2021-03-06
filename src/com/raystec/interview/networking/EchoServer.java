package com.raystec.interview.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
public static void main(String[] args) throws IOException {
	
	ServerSocket server=new ServerSocket(4445);
	System.out.println("Server started");
	
	Socket client=null;
	boolean flag=true;
	while(flag){
		client=server.accept();
		talk(client);
	}
	server.close();
	System.out.println("Server is closed");
	
	
}

public static void talk(Socket client) throws IOException{
	
	PrintWriter out=new PrintWriter(client.getOutputStream(),true);
	BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
	
	String line=in.readLine();
	
	while(line!=null){
		
		System.out.println("Server received line : "+line);
		out.println(line+"  "+line);
		
		if(line.equals("Bye")){
			break;
		}
		line=in.readLine();
	}
	out.close();
	in.close();
	client.close();
}

}
