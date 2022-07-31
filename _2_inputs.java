// Date- 13-06-2022    Day-   Monday

import java.util.Scanner;
public class _2_inputs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of digits is: "+sum);
        sc.close();
    }
    
}
