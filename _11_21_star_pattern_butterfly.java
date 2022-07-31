// Date- 17-06-2022    Day-  Friday

// Print the pattern as follows:
// *      *
// **    **          we will break this code in the 4 parts.
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
public class _11_21_star_pattern_butterfly {
    public static void main(String[] args) {
        int i,j,space=6,m,n,p,q;
        // For upper Part---

        // Left upper part---
        for(i=1;i<=4;i++){

            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            // Right upper part---
            for(m=space;m>=1;m--){
                System.out.print(" ");
            }

            for(n=1;n<=i;n++){
                System.out.print("*");
            }

            System.out.println();
            space-=2;
        }
        // For lower part

        // For left lower part---
        int blank_space=0;
        for(p=4;p>=1;p--){
            for(q=1;q<=p;q++){
                System.out.print("*");
            }

            // // For right lower part---
            for(int s=1;s<=blank_space;s++){
                System.out.print(" ");
            }
            for(int t=1;t<=p;t++){
                System.out.print("*");
            }
            blank_space+=2;
            System.out.println();

        }
    }
    
}
