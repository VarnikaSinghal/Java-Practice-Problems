// Date- 18-06-2022    Day-  Saturday

// Write a program to do factorial of a number using Functions.
// Note- We doesn't perform factorial for negative number, so use the condition in program.

// Take  double for factorial of greater values, like 43, 45,etc.

import java.util.*;
public class _23_functions_factorial_of_a_number {
    public static int factorialOfaNumber(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number=sc.nextInt();
        int new_fact=factorialOfaNumber(number);
        System.out.println("The factorial of a number is: "+new_fact);
        //  or
        // System.out.println("The factorial of a number is: "+factorialOfaNumber(number));
        sc.close();
        
    }
    
}
