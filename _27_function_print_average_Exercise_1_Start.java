// Date- 18-06-2022    Day-  Saturday

// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class _27_function_print_average_Exercise_1_Start {
    public static double PrintAverage(double m1,double m2,double m3){

            double average_number=((m1+m2+m3)/3);
            return average_number;
       
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the 3 subjects marks: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double avg=PrintAverage(a, b, c);
        System.out.println("The average of the numbers is: "+avg);

        sc.close();

    }
}
