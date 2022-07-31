// Date- 15-06-2022    Day-   Wednesday

// W.A.P to input 3 subject marks.Find out the result(pass or fail). The passing 
// % is 40.
import java.util.*;
public class _12_passing_marks {
    public static void main(String[] args) {
        double  m1,m2,m3;
        double average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the 3 subjects marks: ");
        m1=sc.nextDouble();
        m2=sc.nextDouble();
        m3=sc.nextDouble();
        average=((m1+m2+m3)/300)*100;
        System.out.println("The marks of students is: "+average);
        if(average>=40){
            System.out.println("The student is Passed");
        }
        else{
            System.out.println("The student is fail");
        }
        
        sc.close();
    }
}
