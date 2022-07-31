// Date- 20-06-2022    Day-  Monday

//Find the minimum and maximum number in an array of integers.
import java.util.*;

public class _38_array_IMP_minimum_and_maximum_number {
    public static void main(String[] args) {
        int minimum=Integer.MAX_VALUE,maximum=Integer.MIN_VALUE;

        Scanner sc=new Scanner(System.in);
        //For taking the size from user---
        System.out.print("Please enter the size of an array: ");
        int size=sc.nextInt();

        int numbers_array[]= new int[size];  //array declaration---

        //For input the array values---
        System.out.println("Please enter the values of an array: ");
        for(int i=0;i<size;i++){            numbers_array[i]=sc.nextInt();
        }
        //for finding the minimum and maximum numbers---
        System.out.println("Length of array"+numbers_array.length);
        for(int i=0;i<=numbers_array.length-1;i++){
            if(numbers_array[i]>maximum){
                maximum= numbers_array[i];
            }
            if(numbers_array[i]<minimum){
                minimum=numbers_array[i];
            }

        }
        System.out.println("The maximum value of an array is: "+maximum);
        System.out.println("The minimum value of an array is: "+minimum);
        
        


        sc.close();
    }
    
}
