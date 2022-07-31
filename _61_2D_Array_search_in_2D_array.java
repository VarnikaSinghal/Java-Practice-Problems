// Date- 22-07-2022    Day- Friday

// W.A.P. to search in 2D array
/*
[23, 4, 1],
[18, 12, 3, 9],
[78, 99, 34, 56],
[18, 12]

Search an element = 34

it can be done using for loop and for each loop also.
*/ 


import java.util.*;
public class _61_2D_Array_search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                      {23, 4, 1},
                      {18, 12, 3, 9},
                      {78, 99, 34, 56},
                      {18, 12},
        };

        int target = 4;


        // this is for method 2
        int ans[] = searchIn2Darray1(arr, target);  //function calling
        System.out.println(Arrays.toString(ans));
    }


// 1ST METHOD TO DO SEARCHING IN THAT WE ONLY RETURN AN INDEX
    public static void searchIn2Darray(int[][] arr, int target){

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){

                if(arr[row][col] == target){

                    System.out.println("Number is found at "+row+" "+col); //we can also return an array
                    // that will contain the index, at which element found.
                }
            }
        }
    }
    

    // 2ND METHOD IN THAT WE RETURNS THE ARRAY THAT CONTAINS THE INDICES OF ELEMENT

    public static int[] searchIn2Darray1(int[][] arr, int target){

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length-1 ; col++){

                if(arr[row][col] == target){
                    int ans[] ={row, col};
                    return ans;
                }
            }
        }

        return new int[] {-1, -1};



    }




}
