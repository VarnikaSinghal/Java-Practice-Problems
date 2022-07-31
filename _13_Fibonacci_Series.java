// Date- 15-06-2022    Day-   Wednesday

// Find and print the fibonacci series
import java.util.*;
public class _13_Fibonacci_Series {
    public static void main(String[] args) {
        int a=0,b=1,f,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term of Fibonacci Series: ");
        n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=n;i++){
        f=a+b;
        // System.out.print(f+" ");
        a=b;
        b=f;
        System.out.print(f+" ");

        sc.close();
    }
}
}
