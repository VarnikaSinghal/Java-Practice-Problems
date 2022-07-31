// Date- 18-06-2022    Day-  Saturday

// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class _29_function_greater_of_two_numbers {
    public static int greaterNumber(int m, int n){
        int great_num;
        if(m>n){
            great_num=m;
            // or directly do, return a;
        }
        else{
            great_num=n;   //return b;
        }
        return great_num;  //function return
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int greater=greaterNumber(a,b);  //function calling 
        System.out.println("The greater number between the two is: "+greater);

        sc.close();
    }
    
}
