// Find GCD of two numbers
// Problem Statement: Given two integers N1 and N2, 
// find their greatest common divisor.
import java.util.Scanner;
class Gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a = sc.nextInt();
        System.out.println("Enter the second integer:");
        int b = sc.nextInt();
        // Brute Force approach
        // gcd is the biggest common divisor in both of the integers
        // dividing both the integers
        // Let's see the basic approch through this will be solved
        // int range;
        // int div=1;
        // if(N1>N2){
        //     range = N2;
        // }
        // else{
        //     range = N1;
        // }
        // for(int i=1;i<=range;i++){
        //     if(N1%i == 0 && N2%i==0){
        //         div = i;
        //     }
        // }
        // Eucledian Method
        while(b%a!=0){
           int r = b%a;
           b =a;
           a = r;

        }
        System.out.println(a);
        // System.out.println("The gcd of "+N1+" "+N2+" is "+div);
    }
}