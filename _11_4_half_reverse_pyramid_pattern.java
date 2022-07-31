// Date- 15-06-2022    Day-   Wednesday

// HALF REVERSE PYRAMID
// * * * *
// * * *
// * *
// *
import java.util.*;
public class _11_4_half_reverse_pyramid_pattern {
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows(m) and column(n): ");
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        sc.close();
    }
    
}
