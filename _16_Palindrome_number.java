// Date- 15-06-2022    Day-   Wednesday

// Take a number as a input and check that it is palindrome or not.
import java.util.*;
public class _16_Palindrome_number {
    public static void main(String[] args) {
        int n,temp,palindrome,reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n=sc.nextInt();
        palindrome=n;
        while(n>0){
            temp=n%10;
            reverse=reverse*10+temp;
            n=n/10;
        }
        if(reverse==palindrome){
            System.out.println("This is a palindrome number.");
        }
        else{
            System.out.println("This is not a palindrome number.");
        }

        sc.close();
    }
}
