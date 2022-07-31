// Date- 17-06-2022    Day-  Friday

// Print the pattern-
//     * * * * *
//    * * * * * 
//   * * * * *
//  * * * * *
// * * * * *

public class _11_18_star_pattern {
    public static void main(String[] args) {
        int i,j,space=4,k;
        for(i=1;i<=5;i++){
            for(j=space;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=5;k++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
    
}
