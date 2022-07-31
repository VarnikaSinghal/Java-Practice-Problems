// Date- 22-07-2022    Day- Friday
// It is the basics of Array List, like declaration and adding the items
import java.util.*;
public class _55_Array_List {
    public static void main(String args[]){
       ArrayList <Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

       //adding the elements in the array list
       System.out.print("Enter the elements in the ArrayList: ");

       for(int i = 0; i < 6 ; i++){
        list.add(sc.nextInt());
       }

       //removing the elements from the list
       list.remove(2); //list.remove(index)

       //printing the elements of array list
       for(int i = 0; i< list.size(); i++){
        System.out.print(list.get(i)+" ");
       }

       sc.close();
       
    }    
}
