// Date- 14-06-2022    Day-   Tuesday

import java.util.Scanner;
class _4_SI_calculate{
   
    public static void main(String[] args) {
        double p,r,t,si;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of p,r and t: ");
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        si=(p*r*t)/100;
        System.out.println("The simple interest is: "+si);
        sc.close(); //for closing the scanner class

       
    }
}
