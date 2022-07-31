// Date- 27-06-2022    Day- Monday

//Perform the insertion sort on the array.
//  7  3  1  4  2 .
// 1. It is like a arranging the cards on their position, in ascending order. 
// 2. In this i loop will start from 1 bcz,we considers first element as sorted element. 
// and loop of j will run opposite to i, from i-1 to j>=0
// 3. Here, loop of i will run till <array.length, bcz we will search for every element.


public class _54_Sorting_Insertion_Sort {
    public static void main(String[] args) {
        int array[]= {7,3,1,4,2};
        
        ///LOGIC OF INSERTION SORT---
        for(int i=1;i<array.length;i++){
            int j=i-1;
            int temp=array[i];
            
            while(j>=0 && temp<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
            // j--;
        }
    

        //for printing the array after insertion sort---
        System.out.println("After the insertion sort: ");
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");
        }
        
        
    }
    
}
