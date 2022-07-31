// Date- 17-06-2022    Day-  Friday

// Print the pattern as follows-
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
public class _11_17_pyramid_digit_pattern {
    public static void main(String[] args) {
        int i,j,space=4,k;
        for(i=1;i<=5;i++){
            for(k=space;k>=1;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
            space--;
        }
    }
    
}
