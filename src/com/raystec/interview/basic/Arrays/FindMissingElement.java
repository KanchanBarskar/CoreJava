package com.raystec.interview.basic.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
	int[] a={1,2,3,4,5,6,7,8,9,0};
	int[] b={1,2,3,5,6,8,9};
	
	for(int i=0;i<a.length;i++){
		boolean flag=true;
		for(int j=0;j<b.length;j++){
			if(a[i]==b[j]){
				flag=false;
				break;
			}
		}
		if(flag==true){
			System.out.println(a[i]);
		}
		
		
	}
}
}
 