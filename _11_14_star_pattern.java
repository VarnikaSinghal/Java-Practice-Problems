// Date- 17-06-2022    Day-  Friday

// Print the following pattern: 
// *
// * * *
// * * * * *
// * * * * * * *
// * * * * * * * * *

public class _11_14_star_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i+=2){  //here, i is increasing by 2, so it will only print 3 lines, instead of 5 lines. 
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
