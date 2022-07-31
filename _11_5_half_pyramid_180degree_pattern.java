// Date- 15-06-2022    Day-   Wednesday

// print the pattern
//     *
//    **
//   ***
//  ****
// *****
public class _11_5_half_pyramid_180degree_pattern {
    public static void main(String[] args) {
        int i,j,space=4;
        for(i=1;i<=5;i++){
            for(j=space;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}