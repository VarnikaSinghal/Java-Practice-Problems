// Date- 17-06-2022    Day-  Friday

// PRINT THE FOLLOWING SERIES:
// 1 4 9 16 25 36 49 64 81 100
import java.util.*;
public class _18_1_print_the_series {
    public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the term: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            System.out.print(i*i+" ");
        }
        sc.close();
        
    }
}
