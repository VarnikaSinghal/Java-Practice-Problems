// Date- 18-06-2022    Day-  Saturday

// Write a program to do sum of two numbers using functions.
import java.util.*;
public class _21_functions_sum_of_two_numbers{
    public static int sumOfTwoNumbers(int x,int y){
        int sum=x+y;
        return sum;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        int sum_of_numbers=sumOfTwoNumbers(a, b);
        System.out.println("The sum of two numbers is: "+sum_of_numbers);
        sc.close();
    }
    

    
}
