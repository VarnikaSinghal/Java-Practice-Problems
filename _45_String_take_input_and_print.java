// Date- 21-06-2022    Day-  Tuesday
//Take input of string from user and print the output.

import java.util.*;
public class _45_String_take_input_and_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String input: ");
        String name= sc.nextLine();
        //For print the string
        System.out.println("The string is: "+name);
        sc.close();
    }
    
}
