// Date- 17-06-2022    Day-  Friday

// Print the pattern as follows: 
// 1  - i=1,j=1(1,1)
// 0 1  -- 0=>(2,1) and 1=>(2,2)
// 1 0 1
// 0 1 0 1
// 0 1 0 1 0

// Here, we can see that,0 is present at the odd number sum, like (i=1,j=0)
// sum(i,j)=odd and 1 is present at the even points sum (i=1,j=1),sum=2.

public class _11_19_0_and_1_IMP_digit_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
