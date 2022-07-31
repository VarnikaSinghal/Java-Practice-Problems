// Date- 24-06-2022    Day-  Friday

// Take an array as input and find the largest and second largest element in array.
import java.util.*;
import java.util.Arrays;
public class _51_array_largest_and_second_largest_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size= sc.nextInt();
        int array[]= new int[size];  //array declaration

        if(size<2){
            System.out.println("Sorry, There should be at least two numbers.");
        }

        else{
             //enter the elements in array
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();   
        }
        Arrays.sort(array);
        int largest=array[size-1];
        int second_largest=array[size-1];
        for(int j=size-1;j>=0;j--){
            if(array[j]<second_largest){
                second_largest=array[j];
                break;
            }
        }
        System.out.println("Largest: "+largest);
        // if there is largest duplicate numbers.
        if(second_largest==largest){
            System.out.println("There is no second largest number.");
        }
        else{
        System.out.println("Second Largest: "+second_largest);
        }

        }
        
    sc.close();

    }
    
}
