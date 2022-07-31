// Date- 18-06-2022    Day-  Saturday

// Make a function to check a prime number.
import java.util.*;
public class _24_functions_to_check_prime_number {

public static void primeNumber(int p){
    if(p==1){
        System.out.println("This is neither a prime number nor a composite number.");
    }
    boolean isprime=true;
    for(int i=2;i<=p/2;i++){ 
        if(p%i==0){
            isprime=false;
            break;
        }
    }    
    if(isprime==true){
        System.out.println("The number is prime number.");
    }
    else{
        System.out.println("The number is not prime number.");
    }

     return;

}
public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number: ");
    n=sc.nextInt();
    primeNumber(n);        //Function Calling
    sc.close();
}
    
}
