// Date- 22-07-2022    Day- Friday

// W.A.P. to find /search maximum element in 2D array

/*
[23, 4, 1],
[18, 12, 3, 9],
[78, 99, 34, 56],
[18, 12]
*/


public class _62_2D_Array_search_max_value_in_2D_array {
    public static void main(String[] args) {
        
        int[][] arr = new int[][]{
                            {23, 4, 1},
                            {18, 12, 3, 9},
                            {78, 99, 34, 56},
                            {18, 112},
                        };
        
        System.out.print(searchMaxElement(arr));  //function calling

    }

    public static int searchMaxElement(int[][] arr){
        int maxValue = Integer.MIN_VALUE;

        //using for each loop

        for(int row[] : arr){  // firstly, it will take the first row as array, like we did in python.
            for(int col : row){

                if(col > maxValue){
                    maxValue = col;
                }
            }
        }

        return maxValue;
    }
    
    
}
