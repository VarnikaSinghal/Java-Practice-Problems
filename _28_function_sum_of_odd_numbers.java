// Date- 18-06-2022    Day-  Saturday

// Write a function to print the sum of all odd numbers from 1 to n
import java.util.*;

public class _28_function_sum_of_odd_numbers {
    public static void sumOfOddNumbers(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of all odd numbers is: "+sum);
        return;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n=sc.nextInt();
        sumOfOddNumbers(n);

        sc.close();

    }
    
}
