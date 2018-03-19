package com.raystec.interview.generics;

public class Data<T> {
 T value;
 
 public Data(T value){
	 this.value=value;
 }
 
T  getValue(){
	 return value;
 }

void showType(){
	System.out.println("Type of T is" +value.getClass().getName());
}

}
