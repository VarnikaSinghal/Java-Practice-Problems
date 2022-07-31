// Date- 22-07-2022    Day- Friday

// Binary Search always performs on sorted array either in ascending or descending order.
// i will search for particular element using binary search. 
// Complexity - Best Case - O(1)
        //    - Worst Case - O(log2(N)) or log(N) 

public class _64_Binary_Search_Implementation {
    public static void main(String[] args) {
        int[] arr = {-12, -8, -5, 10, 24, 34, 48, 57};
        int target = -8;

        int ans = binarySearch(arr, target);  //function calling
        System.out.println(ans);
    }
    
    public static int binarySearch(int[] arr, int target){
        // find the middle element 
        int start = 0;
        int end = arr.length-1;

        // int middle = start + (end - start)/2;

        // conditions---

        while(start <= end){

            int middle = start + ((end - start)/2);

            // if middle < target
            if(arr[middle] < target){

                start = middle + 1;
            }
            // if middle > target
            else if(arr[middle] > target){

                end = middle - 1;

            } 
            // if middle == target, means ans found
            else{
                return middle;
            }
        }
        
    return -1;


    }
}
