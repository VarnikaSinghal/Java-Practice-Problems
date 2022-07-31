// Date- 21-06-2022    Day-  Tuesday
// Take an array of string input from the user and print their names after input.
import java.util.*;
class _47_Strings_Take_name_array_and_print{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of names: ");
        int size=sc.nextInt();
        String str[]=new String[size]; //string array declaration
        
        //Names entering---
        System.out.println("Please Enter the names: ");
        for(int i=0;i<size;i++){
            str[i]=sc.next();
            // sc.nextLine(); //for clearing the buffer
        }
        //String array output---
        System.out.println("The names you entered are: ");
        for(int j=0;j<size;j++){
            System.out.println(str[j]);
        }
        sc.close();
        
    }
}