package com.raystec.interview.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class QuoteClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket();
		
		byte[] buff=new byte[256];
		InetAddress address=InetAddress.getByName("127.0.0.1");
		
		//create a new packete
		DatagramPacket packet=new DatagramPacket(buff, buff.length, address, 4445);
		socket.send(packet);
		
		//create empty data packet
		packet=new DatagramPacket(buff, buff.length);
		socket.receive(packet);
		
		String received=new String(packet.getData());
		System.out.println("Quote of the moment : "+received);
		socket.close();
		
	}
}
