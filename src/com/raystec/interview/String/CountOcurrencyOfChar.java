
package com.raystec.interview.String;

import javax.swing.text.AbstractDocument.LeafElement;

public class CountOcurrencyOfChar {
public static void main(String[] args) {
	String name="Kanchan Barskar";
	String s=name.replace("\\s", "");
	int i=s.length()-s.replace("a","").length();
	System.out.println("char a ocurrency count = "+i);
}
}
