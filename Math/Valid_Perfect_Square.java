class Solution {
    public boolean isPerfectSquare(int num) {
        // TLE Error
        // for(int i =0;i*i<=num;i++){
        //     if(i*i == num){
        //         return true;
        //     }
        // }
        // return false;
        // Got a pattern of perfect square
        // Every perfect square end digit is 0,1,4,5,6,9 .
        // double value = Math.sqrt(num);
        // int value1 = (int)value;
        // if(value>value1){
        //     return false;
        // }
        // return true;
        if (num < 1) return false;
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
// import java.util.Scanner;
// public class Valid_Perfect_Square {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to check: ");
//         int num = sc.nextInt();
//         boolean flag = false;
//         for(int i =0;i*i<=num;i++){
//             if(i*i == num){
//                 flag = true;
//                 System.out.println(num+" is a valid perfect square of "+i);
//             }
//         }
//         if(flag == false){
//         System.out.println(num+" is not a valid perfect Square.");
//         }
//         sc.close();
//     }
// }
