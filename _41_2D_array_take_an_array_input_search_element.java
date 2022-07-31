// Date- 21-06-2022    Day-  Tuesday
// Take an 2D array as input and search for a element in an array, and print the 
// indices at which it ocuurs.

import java.util.*;
public class _41_2D_array_take_an_array_input_search_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of row and column for an array: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        //array declaration and initialisation
        int search_array[][]= new int[rows][cols];

        //elements input
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                search_array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number, you want to search in an array: ");
        int x=sc.nextInt();

        //element search
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(search_array[i][j]==x){
                    System.out.println(x+" found at index "+"("+i+","+j+")");
                }
            }
        }
        
    
        sc.close();
    }
   
}
