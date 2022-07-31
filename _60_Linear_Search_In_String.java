// Date- 22-07-2022    Day- Friday

// Search an element in the string 
// str = "kunal",  target = 'u'
//this can be done in 2 ways - 1. for loop
                            // 2. for-each loop 


public class _60_Linear_Search_In_String {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'p';

        System.out.print(stringSearch2(name, target));  //function calling
    }


    // when returning a index of character ----------
    
    public static int stringSearch(String name, char target){
        int index;
        for(index = 0; index < name.length(); index++){
            if(name.charAt(index) == target){
                return index;  // if elememnt found in the string
            }
        }
        return -1;  // if element not found in the string

    }


    // when want to return true or false ------------

    public static boolean stringSearch1(String name, char target){
        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i) == target){
                return true;
            }
        }

        return false;  //if element not found
    }

    // using for each loop ----------

    public static boolean stringSearch2(String name, char target){

            for(char i : name.toCharArray()){ //name.toCharArray() is used to convert string into array
                if(i == target){
                    return true;
                }
            }

        
        return false; // if element not found
    }
}
