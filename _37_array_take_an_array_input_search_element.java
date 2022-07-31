// Date- 20-06-2022    Day-  Monday

//Take an array as input from the user.Search for a given numeber X & print the index
// at which it occurs.
import java.util.*;
// import java.util.Arrays; //it is used to use arr.sort and arr.length.

public class _37_array_take_an_array_input_search_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int array_list[]=new int[size]; 
        System.out.print("Enter the values: ");

        //for input the elements of array
        for(int i=0;i<=size-1;i++){
            array_list[i]=sc.nextInt();
        }
        System.out.print("Enter the element you want to search in array:  ");
        int x=sc.nextInt();

        //for searching an element in an array
        for(int j=0;j<=array_list.length-1;j++){
            if(array_list[j]==x){
                System.out.print(x+" is found at index "+j);
            }
            
        }

        sc.close();
    }
    
}
