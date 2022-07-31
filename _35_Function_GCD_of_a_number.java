// Date- 19-06-2022    Day-  Sunday
// Write a function that calculates the Greatest Common Divisor of 2 numbers.
// GCD =Greatest Common Divisor or HCF= Highest Common Factor
// For example, 50 and 60, has the GCD= 10, as 2,5,10
import java.util.*;
public class _35_Function_GCD_of_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
        }
        System.out.println("GCD of two numbers is: "+n2);


    sc.close();        
    }
    
}
