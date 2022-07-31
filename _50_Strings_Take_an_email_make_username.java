// Date- 24-06-2022    Day-  Friday
// Input an email from the user. You have to create a username from the email,
// by deleting the part that comes after '@'.Display that username to the user.

import java.util.*;
public class _50_Strings_Take_an_email_make_username {
    public static void main(String[] args) {
        String userName="";  //empty string to store the words of email till @.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the email: ");
        String email=sc.next();
        // to access the each word of email string.
        for(int i=0;i<email.length();i++){
            char word=email.charAt(i);
            if(word=='@'){   //if(email.charAt(i) == '@') 
                break;
            }
            else{
                userName+= word;
            }
        }
        System.out.println("User Name: "+userName);
    

        sc.close();
    }
    
}
