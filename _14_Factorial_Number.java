// Date- 17-06-2022    Day-  Friday

// Find a factorial of a number
import java.util.Scanner;
public class _14_Factorial_Number {
    public static void main(String[] args) {
        double i,factorial=1;
        double n;
        System.out.print("Enter the value for factorial: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        for(i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial: "+factorial);

        sc.close();
    }
    
}
