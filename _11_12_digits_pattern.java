// Date- 16-06-2022    Day- Thursday

// Print the pattern as follows:
// 5 4 3 2 1
// 5 4 3 2 
// 5 4 3
// 5 4 
// 5

public class _11_12_digits_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
