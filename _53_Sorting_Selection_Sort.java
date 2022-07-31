// Date- 27-06-2022    Day- Monday

// Perform Selection Sort on the array of number.
//In selection sort, we takes the smallest number, and compares other numbers with 
// the smallest,and is any number than the smallest, we'll make that smallest.,
//  and at last we'll swap the element, then 1 pass will be completed,then 2nd will start.

// 8 2 1 5 3. sort the array by selection sort.
//make the first element as smallest,and compare that.

public class _53_Sorting_Selection_Sort {
    //we will make function to print the elements of array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }




    public static void main(String[] args) {
        int array[]={8,2,1,5,3};
        //LOGIC STARTS
        for(int i=0;i<array.length-1;i++){// loop will run till array.length-1
            int smallest=i;//we will only take only index,not the full value,o/w problem will occured when we'll swap
            for(int j=i+1;j<array.length;j++){ //j loop will start from one step ahead from i to compare.

                if(array[j]<array[smallest]){  //condition to check smaller number than smallest.
                    smallest=j;
                }
            }
            //swapping of elements
            int temp=array[i];
            array[i]=array[smallest];
            array[smallest]=temp;

        }
        printArray(array); //function calling with actual argument
    }
    
}

//here, in the program, we took only i and j in the smallest, bcz, when the loop of j.
// will be completed, it will be easy for us to swap the numbers.