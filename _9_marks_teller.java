// Date- 15-06-2022    Day-   Wednesday

//  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)


import java.util.*;
public class _9_marks_teller{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter the marks(should be less than 100): ");
            int marks=sc.nextInt();
            if(marks>100){
                System.out.println("You entered the marks greater than 100");
            }
            else{
                if(marks>=90){
                    System.out.println("This is Good!");
                }
                else if(marks<=89 && marks>=60){
                    System.out.println("This is also Good!");
                }
                else if(marks<=59 && marks>=0){
                    System.out.println("This is good as well!");
                }
            }
            System.out.println("Do you want to continue: ");
            System.out.println("Enter a value 1(for Yes), 0(for NO)");
            input=sc.nextInt();
        }while(input==1);





        sc.close();
    }
}    