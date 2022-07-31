// Date- 17-06-2022    Day-  Friday

// Print the pattern as follows- 
//     *
//    ***
//   *****
//  *******
// *********
public class _11_15_triangle_star_pattern {
    public static void main(String[] args) {
        int i,j,k,space=4;
        for(i=1;i<=9;i+=2){
            for(j=space;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            space--;
        System.out.println();
        }
        
    }
    
}
