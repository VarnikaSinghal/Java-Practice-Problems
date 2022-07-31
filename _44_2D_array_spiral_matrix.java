// Date- 21-06-2022    Day-  Tuesday

//Print the spiral order matrix as output for a given matrix of numbers.
// 11 15 17 91 10 11 
// 16 10 12 13 20 21
// 29 25 29 30 32 47
// 75 34 97 23 23 45 
// 40 23 76 12 32 43 

//Spiral Order- 
//[11,15,17,91,10,11,21,47,45,43,32,12,76,23,49,75,29,16,10,12,13,20....29,30] 

//we took dir varibale here, because sometimes it prints unnecessary values in matrix.

import java.util.*;
public class _44_2D_array_spiral_matrix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the rows and columns of an array: ");
        int row_size=sc.nextInt();
        int col_size=sc.nextInt();

        //array decalration
        int spiral_array[][]= new int[row_size][col_size];

        //for input the elements in array
        System.out.println("Please enter the elements of an array: ");
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                spiral_array[i][j]=sc.nextInt();
            }
        }

        //for traverse on the matrix spirally
        int start_row=0, start_column=0, end_row=row_size-1, end_column=col_size-1;
        int dir=0; //for turning it into left,right,up and down.
        // 0=> Left, 1=>Down, 2=> Right->Left, 3=>Bottom->Up

        while(start_row<=end_row && start_column<=end_column){

            //for row(LEFT TO RIGHT)
            if(dir==0){
            for(int j=start_column;j<=end_column;j++){
                System.out.print(spiral_array[start_row][j]+" ");
            }
            start_row++;
            }

            if(dir==1){
            //for column(TOP TO BOTTOM)
            for(int i=start_row;i<=end_row;i++){
                System.out.print(spiral_array[i][end_column]+" ");
            }
            end_column--;
            }

            if(dir==2){
            //for row(RIGHT TO LEFT)
            for(int j=end_column;j>=start_column;j--){
                System.out.print(spiral_array[end_row][j]+" ");
            }
            end_row--;
            }

            if(dir==3){
            //for column(BOTTOM TO TOP)
            for(int i=end_row;i>=start_row;i--){
                System.out.print(spiral_array[i][start_column]+" ");
            }
            start_column++;
            }

            dir=(dir+1)%4;


        }
        sc.close();
    }
    
}
