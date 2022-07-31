// Date- 18-06-2022    Day-  Saturday

// Print the Prime Numbers between 1 to 100.

public class _20_print_prime_numbers {
    public static void main(String[] args) {
        int i;
        boolean isprime;
        for(i=2;i<=100;i++){
            isprime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime==true){
                System.out.print(i+" ");
            }
            


        }
    }
}
        
    
    
    

        
    
    

