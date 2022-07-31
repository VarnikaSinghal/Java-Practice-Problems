// Date- 15-06-2022    Day-   Wednesday

// HOLLOW RECTANGLE

// * * * * * 
// *       *
// *       *
// * * * * *
import java.util.*;
public class _11_2_hollow_rectangle_pattern {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of row(m) and column(n): ");
        m=sc.nextInt();
        n=sc.nextInt();
        
        
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(i==1||j==1||i==m||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    sc.close();
}
}
