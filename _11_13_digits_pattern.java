// Date- 16-06-2022    Day- Thursday

// Print the pattern
// 1
// 2 3
// 4 5 6 
// 7 8 9 10

public class _11_13_digits_pattern {
    public static void main(String[] args) {
        int i,j,number=1;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    
}
