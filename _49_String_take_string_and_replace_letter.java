// Date- 24-06-2022    Day-  Friday

//Input a string from the user. Create a new string called "result" in which you will
// replace the letter "e" in the original string with letter "i".


//  THERE ARE 3 METHODS TO DO THIS, BUT, IT WILL BE BETTER NOT TO USE REPLACE TO MAKE PROGRAM SIMPLE.

import java.util.*;
public class _49_String_take_string_and_replace_letter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string(should include letter 'e'): ");
        String str=sc.next();  //input string
        String result=str;
        for(int i=0;i<result.length();i++){
            char word=result.charAt(i);
            if(word=='e'){
                result=result.replace('e', 'i');   
            }
        
        }
        System.out.println("The result string is: "+result);



        // 2nd LOGIC---

        // String result="";
        // for(int i=0;i<str.length();i++){
        //     char word=str.charAt(i);
        //     if(word=='e'){
        //         result=str.replace('e', 'i');
            
        //     }
        //     else{
        //         result+=word;
        //     }
        // }
    
        // System.out.println("Result String is: "+result+" ");    


        // 3rd LOGIC---

        // import java.util.*;
        // public class _49_String_take_string_and_replace_letter {
        // public static void main(String args[]) {
        // Scanner sc = new Scanner (System.in);

        // String str = sc.next();
        // String result = "";
        
        // for(int i=0; i<str.length(); i++) {
        // if(str.charAt(i) == 'e') {
        // result += 'i';
        // } 
        // else {
        // result += str.charAt(i);
        // }
        // }
        // System.out.println(result);
        // sc.close();
        // }
        // }

        sc.close();
    }
}
    
    

