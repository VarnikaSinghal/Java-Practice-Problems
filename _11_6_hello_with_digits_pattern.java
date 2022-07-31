// Date- 16-06-2022    Day- Thursday

// PRINT THE SAME PATTERN AS SHOWN:
// 1 Hello 5
// 2 Hello 4
// 3 Hello 3
// 4 Hello 2
// 5 Hello 1
// There are more than 1 logic to print this pattern.


// LOGIC 1---
// public class _11_5_hello_with_digits_pattern {
//     public static void main(String[] args) {
//         int i;
//         for(i=1;i<=5;i++){
//             System.out.println(i+" Hello "+(6-i));
//         }

//     }
    
// }

// // LOGIC 2----
// public class _11_5_hello_with_digits_pattern {
//     public static void main(String[] args) {
//         int i,j=5;
//         for(i=1;i<=5;i++){
//             System.out.println(i+" Hello "+(j));
//             j--;
//         }

//     }
    
// }

// LOGIC 3----
public class _11_6_hello_with_digits_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1,j=5;i<=5;i++,j--){
            System.out.println(i+" Hello "+(j));
        }

    }
    
}
