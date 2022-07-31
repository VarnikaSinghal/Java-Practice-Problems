// Date- 22-07-2022    Day- Friday

/*
Order Agnostic Binary Search is that when we don't know, either array is sorted 
ascending order or descending order.

Firstly, we checks that array is in sorted form or not, 
then accordingly performs the search.
 */


public class _65_Order_agnostic_Binary_search {
    public static void main(String[] args) {
        
        int arr[] = {99, 85, 72, 61, 55, 45, 39, 21, 11};
        int target = 11;

        int ans = binarySearch(arr, target); //function calling
        System.out.println(ans);

    }


    public static int  binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc;  // checking array is in ascending order or in descending order
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(start <= end){

            int middle = start + (end - start)/2;     //1. FIND THE MIDDLE

            // directly return the value, if target == middle
            if(target == arr[middle]){

                return middle; // ANS is found
            }


            // if array is in ascending order---
            if(isAsc == true){
                if(target < arr[middle]){  // if target < middle, then search in left
                    end = middle - 1;
                }
                else{   // if target > middle , search in right
                    start = middle + 1;
                }

            }

            // if array is in descending order---
            else{
                if(target > arr[middle]){
                    end = middle - 1;
                }
                else if( target < arr[middle]){
                    start = middle + 1;
                }
                
            }
        }


    return -1;
    }
}
