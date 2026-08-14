// Problem Description: Given an integer N, write a 
// program to print your name N times.
import java.util.Scanner;
public class NameRecursion {
    public static void NamePrint(String A,int N){
        if(N==0){
            return;
        }
        else{
            System.out.println(A);
            N--;
            NamePrint(A, N);
        }
    }
    public static void main(String[] args) {
        String name = "Priyanshu";
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Enter value of N:");
        N = sc.nextInt();
        NamePrint(name,N);
        sc.close();
    }
    
}
