// Problem Description: Given an integer N, write a 
// program to print numbers from 1 to N.
import java.util.Scanner;
public class IntegerRecursion {
    public static void IntegerPrint(int N){

        if(N<=0){
            return;
        }
        // else{
        // System.out.println(V-(N-1));
        // IntegerPrint(N-1,V);
          // }
          System.out.println(N);
        IntegerPrint(N-1); 
        
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int N = sc.nextInt();
        int V = N;
        IntegerPrint(N);
    }
}
