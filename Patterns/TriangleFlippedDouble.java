/*  * * * * *
      * * * *
        * * *
          * *
            *    */
import java.util.Scanner;
class TriangleFlippedDouble{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter n:");
          int n = sc.nextInt();
        //   int nst = n;
        //   int nsp = 0;
        //   System.out.println("Here is your depicted pattern: ");
        //   for(int i=1;i<=n;i++){
        //     for(int j =1 ;j<=nsp;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1;j<=nst;j++){
        //         System.out.print("* ");
        //     }
        //     nst--;
        //     nsp++;
        //     System.out.println("");
        //   }
        //Second Method Below:
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){ //i-1 spaces 
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){  // n-i+1 stars 
                System.out.print("* ");
            }
            System.out.println("");
        }
      }
}