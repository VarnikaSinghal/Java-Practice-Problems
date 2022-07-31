// Date- 16-06-2022    Day- Thursday

// Print the following pattern
// 1 2 3 4 5
// 2 3 4 5
// 3 4 5
// 4 5 
// 5

public class _11_11_digits_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=i;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
