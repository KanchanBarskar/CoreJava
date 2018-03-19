package com.raystec.interview.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class QuoteServer {

	public static void main(String[] args) throws IOException {
		String[] quotes={"Bura Mat Dekho","Bura Mat Suno","Bura Mat kaho"};
		
		DatagramSocket socket=new DatagramSocket(4445);
		//create  a buffer
		byte[] buff=new byte[256];
		
		//create an empty data packet
		DatagramPacket packet=new DatagramPacket(buff, buff.length);
		
		boolean flag=true;
		while(flag){
			socket.receive(packet);
			InetAddress address=packet.getAddress();
			int port=packet.getPort();
			
			int index=(int) (Math.random()*2);
			byte[] quote=quotes[index].getBytes();
			
			//create a new packet with quote
			
			DatagramPacket quotePkt=new DatagramPacket(quote, quote.length,address,port);
			socket.send(quotePkt);
		}
		socket.close();
		
		
	}
}
