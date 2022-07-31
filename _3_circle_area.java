// Date- 13-06-2022    Day-   Monday

import java.util.Scanner;
class _3_circle_area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        int r=sc.nextInt();
        double area= Math.PI*r*r;
        System.out.println("The area of circle is: "+area);
        sc.close();  //its for to close the scanner class, it says class is not closed after use.

    }
    
    }

