// Date- 18-06-2022    Day-  Saturday

// Make a function to check the number is even number or not.
import java.util.*;
public class _25_function_to_check_even_number {
    public static void EvenNumber(int number){
        if(number%2==0){
            System.out.println("The number is even number.");
        }
        else{
            System.out.println("The number is odd number.");
        }
        return;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n=sc.nextInt();
        EvenNumber(n);       //Function Calling


        sc.close();
    }
}
