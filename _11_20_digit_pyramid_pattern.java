// Date- 17-06-2022    Day-  Friday

// Print the folllowing pattern
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5

// we will divide it into 2 parts
// 1 part=           2nd Part=
//        1          
//      2 1           2
//    3 2 1           2 3
//  4 3 2 1           2 3 4
//5 4 3 2 1           2 3 4 5


public class _11_20_digit_pyramid_pattern {
    public static void main(String[] args) {
        int i,j,k,n,space=4;
        // first part---
        for(i=1;i<=5;i++){
            for(j=space;j>=1;j--){
                System.out.print(" ");
            }
            for(k=i;k>=1;k--){
                System.out.print(k);
            }

            // 2nd Part---
            for(n=2;n<=i;n++){
                System.out.print(n);
            }
            
            System.out.println();
            space--;
            
        }
    }
    
}
