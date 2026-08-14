import java.util.Scanner;
public class FactorialRecursion {
    public static int FactPrint(int N){
         if(N<=1){
            return 1;
         }
         return N * FactPrint(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its factorial:");
        int N = sc.nextInt();
        int result = FactPrint(N);
        System.out.println("Factorial: "+ result);
    
    }
}
