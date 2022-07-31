// Date- 18-06-2022    Day-  Saturday

// Write a function to print the table of a number.

import java.util.Scanner;
public class _26_function_to_print_table_of_a_number {
    public static void TableOfaNumber(int number){   //Function defintion
        int table=1;
        for(int i=1;i<=10;i++){
            table=number*i;
            System.out.println(table);
        }

        return;   //it will return nothing(but conventionally used to write.)
    }
    
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);    // for input
        System.out.print("Please enter a number: ");
        n=sc.nextInt();
        TableOfaNumber(n);     //Function Calling

        sc.close();
    }
    
}
