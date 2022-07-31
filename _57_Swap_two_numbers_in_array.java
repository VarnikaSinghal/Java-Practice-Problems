// Date- 22-07-2022    Day- Friday

//W.A.P To swap the two numbers in array
// array before swapping - [1, 86, 3, 52, 9]
// array after swapping of 0 and 2 index - [3, 86, 1, 52, 9]


import java.util.*;
public class _57_Swap_two_numbers_in_array {
    public static void main(String[] args){
        int[] arr = {1, 86, 3, 52, 9};
        System.out.print("Array Before Swapping: ");
        System.out.println(Arrays.toString(arr));

        swapNumbers(arr, 0, 2); //function calling

        // System.out.println(Arrays.toString(arr));
    }
    
    static void swapNumbers(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.print("Array after swapping: ");
        System.out.print(Arrays.toString(arr));
    } 


    
}
