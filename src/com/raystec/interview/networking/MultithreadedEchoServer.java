 package com.raystec.interview.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedEchoServer  extends Thread{

	Socket client=null;
	
	public MultithreadedEchoServer(Socket client){
		this.client=client;
	}
	
	public void run(){
		try{
			PrintWriter out=new PrintWriter(client.getOutputStream(),true);
			BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			String inputLine;
			
			
			inputLine=in.readLine();
			while(inputLine!=null){
				System.out.println("Received line : "+inputLine);
				out.println(inputLine+"  "+inputLine);
				
				if(inputLine.equals("Bye")){
					break;
				}
				inputLine=in.readLine();
			}
			
			out.close();
			in.close();client.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket server=new ServerSocket(4445);
		System.out.println("Server started");
		MultithreadedEchoServer echoServer=null;
		
		Socket sktClient=null;
		boolean flag=true;
		while(flag){
			sktClient=server.accept();
			echoServer=new MultithreadedEchoServer(sktClient);
			echoServer.start();
		}
		
		System.out.println("Echo server stopped");
		server.close();
		
		
	}
}
