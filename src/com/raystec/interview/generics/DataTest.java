package com.raystec.interview.generics;

public class DataTest {
public static void main(String[] args) {
	Data<Integer> i=new Data<Integer>(786);
	i.showType();
	int v=i.getValue();
	System.out.println("Value "+v);
}
}
