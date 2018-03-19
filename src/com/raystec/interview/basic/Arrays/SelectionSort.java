package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[] arr={23,43,12,56,74,87,67,43,87,90,23};
	
	  for (int i = 0; i < arr.length - 1; i++)  
      {  
          int index = i;  
          for (int j = i + 1; j < arr.length; j++){  
              if (arr[j] < arr[index]){  
                  index = j;//searching for lowest index  
              }  
          }  
          int smallerNumber = arr[index];   
          arr[index] = arr[i];  
          arr[i] = smallerNumber;  
      }  
	  System.out.println(Arrays.toString(arr));
}
}
