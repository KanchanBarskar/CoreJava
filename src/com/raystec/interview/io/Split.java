package com.raystec.interview.io;

import java.io.*;

public class Split {
	public static void main(String[] args) throws IOException {
		File f=new File("E:/hello.txt");
		long size=f.length();
		System.out.println(size);
		long split1=size/4;
		long split2=size%4;
		System.out.println(split1+","+split2);
		byte[] b = new byte[(int) split1];
		//byte[] b=new byte(split1);
		//System.out.println(b[1]);
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int j = 0;
		while (j < 4) {
			int i=bis.read(b);
			System.out.println("i="+i);
			FileOutputStream fos = new FileOutputStream("E:/b" + j + ".txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(b);
			bos.close();
			j++;
		}
		if (split2 > 0 && split2 < split1) {
			BufferedOutputStream bw1 = new BufferedOutputStream(
					new FileOutputStream("E:/c" + (split2) + ".txt"));
			byte[] bu = new byte[(int) split2];
			int va = bis.read(bu);
			if (va != -1) {
				bw1.write(bu);
				bw1.close();
			}
			System.out.println("Done Spliting");
	}
	}
}
