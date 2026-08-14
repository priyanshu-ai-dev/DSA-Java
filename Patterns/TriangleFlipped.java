import java.util.Scanner;
class TriangleFlipped{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Here is Your Program's Pattern:");
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //      if((i+j)>=(n+1)){
        //         System.out.print("* ");
        //      }
        //      else{
        //         System.out.print("  ");
        //      }
        //     }
        //     System.out.println("");
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}