// Date- 22-07-2022    Day- Friday

// W.A.P. to find maximum element till the specific start and end

class _58_Array_Find_max_min_till_specific{
    public static void main(String args[]){
        int[] arr = {6, 89, 32, 0, 3, 54};

        int ans = maxFind_till_specific(arr, 2, 5); //function calling

        System.out.print("Max value between start and end is: "+ans);
    }

    //function

    public static int maxFind_till_specific(int[] arr, int start, int end){
        int maxValue = Integer.MIN_VALUE;

        //edge cases
        if(arr == null){ //if array is null
            return -1;
        }

        if(end < start){
            return -1;
        }

        //logic
        for(int i = start; i <= end; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

}