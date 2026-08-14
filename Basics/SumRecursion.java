// Problem Statement: Given a number ‘N’, find 
// out the sum of the first N natural numbers .
import java.util.Scanner;
class SumRecursion{
    public static int SumPrint(int N ){
        if(N<=0){
            return 0;
        }
         return N + SumPrint(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        
        int total = SumPrint(N);
        System.out.println(total);
        sc.close();

    }
}