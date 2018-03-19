package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class FindCommonElementsFromStringArr {
public static void main(String[] args) {
	String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
	 
    String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
    
    System.out.println("Array1 : "+Arrays.toString(array1));
    System.out.println("Array2 : "+Arrays.toString(array2));
    System.out.println("Common elements are : ");
   
     for (int i = 0; i < array1.length; i++)
     {
         for (int j = 0; j < array2.length; j++)
         {
             if(array1[i].equals(array2[j]))
             {
                System.out.println(array1[i]);
             }
         }
     }

}
}
