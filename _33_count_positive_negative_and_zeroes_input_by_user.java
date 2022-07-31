// Date- 18-06-2022    Day-  Saturday

// Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.


// we can directly do it by while loop.

import java.util.Scanner;
public class _33_count_positive_negative_and_zeroes_input_by_user {
    public static void main(String[] args) {
        int number,choice,count_zero=0,count_positive=0,count_negative=0;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Please enter a number: ");
        // number=sc.nextInt();
        do{
            System.out.println("Please enter a number: ");
            number=sc.nextInt();
            if(number==0){
                count_zero+=1;
            }
            else if(number>=1){
                count_positive+=1;
            }
            else{
                count_negative+=1;
            }

            System.out.println("Positive number: "+count_positive);
            System.out.println("Negative number: "+count_negative);
            System.out.println("Zero number: "+count_zero);

            System.out.println("Do you wish to continue? (1 for yes),(0 for no): ");
            choice =sc.nextInt();


        }while(choice==1);

        sc.close();
    }
    
}
