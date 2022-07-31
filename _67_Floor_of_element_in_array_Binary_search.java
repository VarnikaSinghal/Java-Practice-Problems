// Date- 23-07-2022    Day- Saturday

/* I have an given array below, and i want to search 59, in that array, but here i can say
 59 is not present in the array, so it should return the floor(smaller than the particular element) 
 of the element, like 56
 */

// Floor of an element in array -> the greatest element from all the smallest elements, that is smaller 
//  than equal to number.


public class _67_Floor_of_element_in_array_Binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 14, 42, 56, 89};
        int target = 59;

        int ans = floorOfElement(arr, target);  // function calling
        System.out.println(ans);
    }



        public static int floorOfElement(int[] arr, int target){

            int start = 0;
            int end = arr.length - 1;

            //edge cases
            
            // if element is less than the array elements
            if(target < arr[0] || target > arr[arr.length - 1]){
                return -1;
            }

            while(start <= end){

                int mid = start + (end - start)/2;  //finding the middle element

                if(target > arr[mid]){ // if target > mid
                    start = mid + 1;
                }
                else if(target < arr[mid]){ // if target < middle element
                    end = mid - 1;
                }
                else{
                    return mid;  //here, ans is found, target == mid
                }

            }
            return arr[end]; // for floor of the element in the array, we will return end.


        }
   

}
