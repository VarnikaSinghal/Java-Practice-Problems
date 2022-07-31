// Date- 21-06-2022    Day-  Tuesday

// STRINGS ARE IMMUTABLE- ham unme change nahi kar sakte, ham new strings bana kar 
//change karte hai, real string kabhi change nahi hoti.

//some functions of strings are: 
// 1. concatenation(adding the 2 strings)
// 2.length- finds the length of the string
// 3.charAt()- reads the characters
// 4.compareTo()- it compares the two strings
// 5.substring- a small part of string
// 6. Parsing- integer to string and string to integer.

public class _46_some_functions_of_string {
    public static void main(String[] args) {
        String first_name="tony";
        String last_name="stark";

    //1. concatenation- string1.concat(string2)
        String full_name=first_name+last_name;
        System.out.println("Full Name= "+full_name);
        //  OR
        System.out.println(first_name.concat(last_name));
    

    //2. length()- in this we use (),bcz it is a function in string,but in array,
    // it is a method, we don't use () there.

        System.out.println("Length of full name is: "+full_name.length());


    //3. charAt()
        for(int i=0;i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+" ");
        }
        // it will read each character of string and will print it.
        System.out.println();



    //4.compareTo()- it compares the two strings.
        String f_name=new String("tony");  //example of non primitive data type
        String l_name=new String("tony");
        if(f_name.compareTo(l_name)==0){

         //we can use == to compare the strings, then why we use compareTo(),
        //bcz in some cases, this == fails. 

        // if(f_name==l_name){  if we will use == here, it will print strings are 
            // not equal bcz, functioning of non-primitive data types,is different from primitive data types
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        //compareTo() returns 1, if  string 1 is greater than the second one.
        // returnn -1, if string2 is greater than the first one.
        // returns 0, if both the strings are equal.


    //5.Substring- string_name.substring(beginnng,end_index);
        String string_part=full_name.substring(0,5); //5 is not counted,it will run till 4.
        System.out.println("The substring is: "+string_part);

        String new_name=f_name.substring(0); //it will automatically start from 0.
        System.out.println("new name string is: "+new_name);

        String thisString= full_name.substring(5,full_name.length());
        System.out.println("the string length after substring: "+thisString);

    //6. Parsing- Integer.parseInt()- method of integer class
    //          - Integer.toString()- method of string class (to convert integer value to string.)
        
        //Integer.ParseInt()-
            String int_string="12345";
            int string_to_int=Integer.parseInt(int_string);
            System.out.println("The intger value is: "+string_to_int);
            // System.out.println("Data type of this is: "+(Object(string_to_int)).getClass().getSimpleName());

        //Integer.toString()
        int numbers=13578;
        String int_to_string=Integer.toString(numbers);
        System.out.println("Converted string from integer: "+int_to_string);
        System.out.println("Data Type of converted string from integer: "+int_to_string.getClass().getSimpleName());
        
    }

}

//TO CHECK THE DATA TYPE OF INTGER VALUE

// public class MyClass {
//     public static void main(String args[]) {
//         int x = 5;
//         System.out.println(((Object)x).getClass().getSimpleName());
//     }


//TO CHECK THE DATA TYPE OF STRING ARRAY
// String[] arr = new String[5];
// System.out.println(arr.getClass().getSimpleName());
// }