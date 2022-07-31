// Date- 22-07-2022    Day- Friday

// W.A.P that reverse an array using swapping, IT IS THE IMP PROGRAM

import java.util.*;
class _59_Array_Reverse_array_using_swapping_IMP{
    public static void main(String[] args) {
        int[] arr = {1, 5, 32, 45, 78, 84, 98};

        reverseArray(arr); //function calling
    }


    static void reverseArray(int[] arr){

        if(arr == null){  //edge cases
            System.out.print("Not Valid! ");
        }

        int start = 0;
        int end = arr.length -1;

        while(start < end){
        // using swapping

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;

        }
        System.out.print(Arrays.toString(arr));
        
    }
}