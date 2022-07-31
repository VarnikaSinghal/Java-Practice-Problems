// Date- 20-06-2022    Day-  Monday

// Take an array as input from the user & print them on the screen.
import java.util.*;
public class _36_array_take_input_print_name {
    public static void main(String[] args) {
        String names[]= new String[3];  //String[3] is the size of array.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 names: ");
        //For input---
        for(int i=0;i<3;i++){
            names[i]=sc.nextLine();
        }

        //For output---
        System.out.println("The names you entered are: ");
        for(int i=0;i<3;i++){
            System.out.print(names[i]+" ");
        }



        sc.close();
    }
    
}
