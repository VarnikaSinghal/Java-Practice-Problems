// Date- 18-06-2022    Day-  Saturday

// Write a function that takes in the radius as input and returns the
// circumference of a circle.

import java.util.*;

public class _30_function_circumference_of_circle {
    public static double CircumferenceOfCircle(double radius){
        double circum_circle=Math.PI*2*radius; //we can directly use Math.PI library to use PI
        return circum_circle;                  //instead of 3.14
        //or we can directly return 2*3.14*radius;
    }
    public static void main(String[] args) {
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the radius of circle: ");
        r=sc.nextDouble();

        double circum=CircumferenceOfCircle(r);

        System.out.println("The circumference of a circle is: "+circum);


        sc.close();
    }
    
}
