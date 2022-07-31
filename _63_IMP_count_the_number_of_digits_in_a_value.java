// Date- 22-07-2022    Day- Friday

// I have a value - 7238
// no. of digits - 4


// I have a value - 831
// no. of digits - 3

//IT CAN BE DONE IN 3 WAYS---
 //1. CONVERTING THE INTERGER VALUE INTO STRING

 //2. DIVIDE THE DIGIT BY 10, TILL VALUE >0
 
 //3.(VERY OPTIMISED) take log10 of that number and add 1
//  (covert the log value to int, bcz it comes in double, o/w it will give error)


public class _63_IMP_count_the_number_of_digits_in_a_value {
    public static void main(String[] args) {
        int value = 321213;

        logOfNumber(value);  //function calling
       
    }


 //1. CONVERTING THE INTERGER VALUE INTO STRING
    
    static void convertToString( int value){
        String str = Integer.toString(value);

        System.out.println((str.length()));
    }

//2. DIVIDE THE DIGIT BY 10, TILL VALUE >0

    static void divideBy10(int value){
        int count = 0;
        while(value > 0){
            value = value / 10;
            count++;
        }
        System.out.println(count);
    }

//3.(VERY OPTIMISED) take log10 of that number and add 1(covert the log value to int, bcz it comes in double, o/w it will give error)

    static void logOfNumber(int value){
        // int number = int(Math.log(value))+1;
        System.out.println(((int)Math.log10(value))+1);
    }
}
