// Date- 22-07-2022    Day- Friday

// Make the 2D array list and print the list

/*
1 2 3
4 5 6 
7 8 6 
 */

import java.util.*;
public class _56_2D_ArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 

    //Syntax - ArrayList< ArrayList <Data Type >> list = new ArrayList<>();


    //adding the smaller array list, i.e. initialising the array list
    for(int i = 0; i < 3; i++){
        list.add(new ArrayList<>());
       
    }
        //adding elements in the list
        System.out.print("Add the elements in the list: ");
        for(int k= 0;k < 3; k++){
            for(int j = 0; j< 3; j++){
                list.get(k).add(sc.nextInt()); //list.index.element
            }
        }
        System.out.println(list);

        sc.close();
    }

    
    }
    
