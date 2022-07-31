// Date- 16-06-2022    Day-  Thursday

// W.A.P to check that a number is armstrong or not.
// For ex: 153,etc.
import java.util.*;
public class _17_Armstrong_number {
    public static void main(String[] args) {
        int sum=0,num,armstrong;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        num=sc.nextInt();
        armstrong=num;
        while(num>0){
            int temp=num%10;
            sum=sum+(temp*temp*temp);
            num=num/10;

        }
        if(armstrong==sum){
            System.out.println("This is a armstrong number");
        }
        else{
            System.out.println("This is not a armstrong number.");
        }
        
        sc.close();
    }
}
