// Date- 18-06-2022    Day-  Saturday

// Write a function that takes in age as input and returns if that person is eligible
// to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class _31_function_eligible_to_vote {
    public static void EligibletoVote(int age){
        if(age<18){
            System.out.println("The person is not eligible to vote.");
        }
        else if(age>=18){
            System.out.println("The person is eligible to vote.");
        }
        return;   //it will return nothing as it is of return type "void"

    }
    public static void main(String[] args) {
        int age_person;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age of a person: ");
        age_person=sc.nextInt();

        EligibletoVote(age_person); //function calling

        sc.close();

    }
    
}
