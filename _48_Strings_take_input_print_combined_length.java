// Date- 24-06-2022    Day-  Friday

// Take an array of string input from the user & find the commulative(combined) length 
// of all those strings.

import java.util.*;
public class _48_Strings_take_input_print_combined_length {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of string array: ");
        int size= sc.nextInt();
        String str[]= new String[size]; //String Array Declaration
        int c_length=0;

        //String elements input---
        System.out.println("Enter the string elements: ");
        for(int i=0;i<size;i++){
            str[i]= sc.next();
            c_length+=str[i].length(); //for adding the length of each input to c_length

        }
        System.out.println("String Combined length: "+c_length);


            sc.close();
        
    }
}
