// Date- 21-06-2022    Day-  Tuesday
//Create a 2D array in memmory and print its elements.

import java.util.*;
public class _40_2D_Array_input_and_print_its_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and column for 2D array: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        //arary definition
        int array[][]=new int[rows][cols]; 

        //array elements input
        System.out.println("Please enter the elements of array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }

        //array elements output
        System.out.println("Elements of 2D array are:  ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
  
        sc.close();
    }
    
}
