// Date- 20-06-2022    Day-  Monday

// Take an array as input & check it is an array sorted in  ascending order.
// FOR EXAMPLE- {1,2,4,7}- is sorted in ascending order.
        //      {3,4,6,2}- is not sorted in ascending order.

import java.util.*;
public class _39_array_check_array_is_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size= sc.nextInt();
        int array[]=new int[size];
        //for input of array
        System.out.println("Please enter the values for array: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        //for checking the array, is in ascending order or not.
        boolean is_ascending=true;
        for(int j=0;j<size-1;j++){
            if(array[j+1]<array[j]){
                is_ascending=false;
                break;
            }
        }
        if(is_ascending==false){
            System.out.println("Array is not sorted in ascending order.");
        }
        else{
            System.out.println("Array is sorted in ascending order.");
        }



        sc.close();
    }
    
}
