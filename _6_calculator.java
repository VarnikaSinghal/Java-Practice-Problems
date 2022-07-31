// Date- 14-06-2022    Day-   Tuesday

//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	// 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the user.
     


import java.util.*;
public class _6_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        char input;
        System.out.print("Enter the Value of A = ");
        a=sc.nextInt();
        System.out.print("Enter the Value of B = ");
        b=sc.nextInt();
        System.out.println("Select the One Operation you want to Perform");
        System.out.println("+, -, *, /, % ");
        System.out.print("Enter the Operator which You Want = ");
        input= sc.next().charAt(0);
        if(input=='+'){
            System.out.println("Addition = "+(a+b));
        }
        else if(input=='-'){
            System.out.println("Substraction = "+(a-b));
        }
        else if(input=='*'){
            System.out.println("Multiplication = "+(a*b));
        }
        else if(input=='/'){
            if(b==0){
                System.out.println("Invalid Division");
            }
            else{
            System.out.println("Divisionion = "+(a/b));
            }
        }
        else if(input=='%'){
            if(b==0){
                System.out.println("Invalid Division");
            }
            else{
            System.out.println("Remainder = "+(a%b));
            }
        }
    
        else{
            System.out.println("Not Valid Value");
            System.out.println("Please Try Again...");
        }
       
        sc.close();
        
    }
    
}

// "ALTERNATE METHOD TO DO THIS"

// import java.util.*;
 
// public class Conditions {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int operator = sc.nextInt();
 
//        /**
//         * 1 -> +
//         * 2 -> -
//         * 3 -> *
//         * 4 -> /
//         * 5 -> %
//         */
 
//        switch(operator) {
//            case 1 : System.out.println(a+b);
//            break;
//            case 2 : System.out.println(a-b);
//            break;
//            case 3 : System.out.println(a*b);
//            break;
//            case 4 : if(b == 0) {
//                        System.out.println("Invalid Division");
//                    } else {
//                        System.out.println(a/b);
//                    }
// 	    break;
//            case 5 : if(b == 0) {
//                        System.out.println("Invalid Division");
//                    } else {
//                        System.out.println(a%b);
//                    }
// 	    break; 
//            default : System.out.println("Invalid Operator");
//        }
//    }
// }
