// Date- 15-06-2022    Day-   Wednesday

// Take a number as a input and print its reverse.

import java.util.Scanner;
public class _15_Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,reverse=0,temp;

        System.out.println("Please enter a number: ");
        n=sc.nextInt();

        // LOGIC 1-------------
        // while(n>0){
        //     temp=n%10;
        //     System.out.print(temp);
        //     n=n/10;
        // }
        


        // LOGIC 2----------
        while(n>0){
            temp=n%10;
            reverse=reverse*10+temp;
            n=n/10;
        }
        System.out.println("The reverse of a number is: "+reverse);
        sc.close();
        
    }
    
}
