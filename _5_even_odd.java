// Date- 14-06-2022    Day-   Tuesday

import java.util.Scanner;
public class _5_even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two values: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else if (b>a){
            System.out.println("a is lesser than b");
        }
        sc.close();
        
    }
    
}
