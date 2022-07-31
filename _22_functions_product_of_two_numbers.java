// Date- 18-06-2022    Day-  Saturday

// Make a program of product of two numbers using functions.
import java.util.Scanner;
public class _22_functions_product_of_two_numbers {
    public static void Product(int a,int b){
        System.out.println("The product of two numbers is: "+(a*b));
        return;

    }
    
    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        Product(a, b);

        sc.close();
    }
}
