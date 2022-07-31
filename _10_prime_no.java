// Date- 15-06-2022    Day-   Wednesday

// Print if a number is prime or not (Input n from the user). 
import java.util.*;
public class _10_prime_no {
    public static void main(String[] args) {
        int n;
        boolean isprime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
                break; //because prime number only divisible by itself.
            }
        }
        if(n==1){
            System.out.println("This is not a prime or composite number.");
        }
            else if(isprime==true){
                System.out.println("This is a prime number.");
            }
            else{
                System.out.println("This is not a prime number.");
            }
        
        sc.close();
    }
    
}
