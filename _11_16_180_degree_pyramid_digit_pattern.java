// Date- 17-06-2022    Day-  Friday

// Print the the pattern as follows:
//1
//1 2 
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 
//1 2 3
//1 2
//1
public class _11_16_180_degree_pyramid_digit_pattern {
    public static void main(String[] args) {
        int i,j,m,n;
        // First Part---
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // second part---
        for(m=4;m>=1;m--){
            for(n=1;n<=m;n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        
    }
    
}
