// Date- 23-07-2022    Day- Saturday

/* I have an given array below, and i want to search 66, in that array, but here i can say
 66 is not present in the array, so it should return the ceiling(greater than the particular element) 
 of the element, like 78
 */

// Ceiling of a number an an array -> The smallest number from all the greater number from the array that
// is greater than equal to the number.
class _66_Ceiling_of_element_in_array_Binary_search{
    public static void main(String[] args) {
    
    int[] arr = {1, 5, 12, 35, 57, 78, 89};
    int target = 2;

    //function calling

    int ans = ceilingElement(arr, target);

    System.out.println(ans);
}

    public static int ceilingElement(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if(target > arr[arr.length - 1] || target < arr[0]){ //if elements are outside the array
            return -1;
        }

        while(start <= end){   //while start is less than the end 

                // find mid element 
            mid = start + (end - start)/2;

            if(target > arr[mid]){  // target > middle
                start = mid + 1;
            }

            else if(target < arr[mid]){ // if target < middle
                end = mid - 1;
            }

            else{
                return mid;
            }
        }

    return arr[start]; // as at the end, start > end , (start = end + 1 )
    // and there, start will be at the position, where, greater than the searched element exists.

    }
}