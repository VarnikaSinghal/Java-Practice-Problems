// Date- 21-06-2022    Day-  Tuesday

// For a given matrix nxm, print its transpose.
// Transpose is that, converting the rows into columns, and columns to rows.

//also include the non square matrix case

import java.util.*;
public class _43_2D_array_transpose_of_a_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of a matrix: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        //array declaration
        int transpose_array[][]=new int[rows][cols];

        // //second matrix to store the transpose of a first matrix
        // System.out.println("Enter the number of rows and columns for transpose matrix: ");
        // int rows1=sc.nextInt();
        // int rows2=sc.nextInt();
        int transpose_2[][]= new int[cols][rows];

        //input elements
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose_array[i][j]=sc.nextInt();
            }
        }

        //transpose of an array
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                transpose_2[i][j]=transpose_array[j][i];
            }
        }

        //for output of array
        System.out.println("Array after transpose: ");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(transpose_2[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
