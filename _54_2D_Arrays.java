// Date- 22-07-2022    Day- Friday

/*
Make a 2D array, in that columns numbers are different
1 2 3 
4 5 
6 7 8 9
 */

// it is very IMP, we traverse column till arr[row].length

import java.util.*;
public class _54_2D_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = {
                        {1,2,3},
                        {4,5},
                        {6,7,8,9}
        };
        
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
