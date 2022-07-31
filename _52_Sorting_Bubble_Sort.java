// Date- 27-06-2022    Day- Monday

// Perform bubble sort on the array of number.
// IN bubble sort, we put the elements in ascending order. Firstly, put largest element
//  in last, by swapping the number to each other, (isme ham har step par swapping karte hain).
// Time Complexity of Bubble Sort is :- O(n^2) 
//  7 3 8 1 2 

import java.util.*;
public class _52_Sorting_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of an array: "); //for size of an array
        int size= sc.nextInt();
        int array[]= new int[size];
        //For taking elements in array
        System.out.println("Enter the elements of an array: ");
        for(int n=0;n<size;n++){
            array[n]=sc.nextInt();
        }

        //LOGIC FOR BUBBLE SORT---
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j+1]; //Swapping of elements using 3rd variable
                    array[j+1]=array[j];
                    array[j]=temp;
                    
                }
            }
        }
        //for printing the elements of array,either we can make a function or
        //  can directly print the elements.
        System.out.println("Sorting of elements using Bubble Sort: ");
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");

        }
       sc.close(); 
    }
    
}
