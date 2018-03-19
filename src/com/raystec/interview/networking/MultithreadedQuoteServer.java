package com.raystec.interview.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;


public class MultithreadedQuoteServer extends Thread {
	
	protected DatagramSocket socket=null;
	protected BufferedReader in=null;
	protected boolean moreQuutes=true;
	protected String[] quotes={"Bura Mat Suno","Bura Mat Dekho","Bura Mat Bolo"};
	
	public MultithreadedQuoteServer() throws SocketException{
		this("Multithreaded Quote Server");
	}
	
	public MultithreadedQuoteServer(String name) throws SocketException{
		super(name);
		socket=new DatagramSocket(4443);
	}
	
	public void run(){
		
		while(moreQuutes){
			try{
				byte[] buff=new byte[256];
				DatagramPacket packet=new DatagramPacket(buff, buff.length);
				socket.receive(packet);
				
				String dString=null;
				if(in==null){
					dString=new Date().toString();
					
				}else{
					dString=getNextQuote();
				}
				buff=dString.getBytes();
				InetAddress address=packet.getAddress();
				int port=packet.getPort();
				packet=new DatagramPacket(buff, buff.length, address, port);
				socket.send(packet);
			}catch(IOException e){
				e.printStackTrace();
				moreQuutes=false;
			}
			socket.close();
		}
		
	}
	
	protected String getNextQuote(){
		String returnValue;
		try {
			returnValue = in.readLine();
			if(returnValue==null){
				in.close();
				moreQuutes=false;
				returnValue="No, More quotes Good bye";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			returnValue="IoException occured in server";
			
		}
		
		return returnValue;
		
	}
	
	public static void main(String[] args) throws SocketException {
		new MultithreadedQuoteServer().start();
	}

}
