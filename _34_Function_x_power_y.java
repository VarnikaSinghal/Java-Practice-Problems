// Date- 18-06-2022    Day-  Saturday

// Two numbers are entered by the user, x and n. Write a function to find
// the value of one number raised to the power of another i.e. 𝑥 .

// we will find the power by using for loop. like, 2(x) ki  power 3(n), then 2*2*2
//  for loop i se n tak chal jayega and x ki multiply utne time hoti rahegi.


import java.util.*;
public class _34_Function_x_power_y {
    public static void xPowerOfy(int x,int y){
        int result=1;
        for(int i=1;i<=y;i++){
            result=result*x;
        }
        System.out.println("The result of x power y is: "+ result);
        
    return;

    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);  //scanner class ka object
        System.out.print("Enter the value for x: ");
        a=sc.nextInt();
        System.out.print("Enter the value for power of x (n): ");
        b=sc.nextInt();

        xPowerOfy(a,b);
        sc.close();
    }
    
}
