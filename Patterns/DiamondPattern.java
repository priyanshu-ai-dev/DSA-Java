import java.util.Scanner;
class DiamondPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Here is your featured pattern: ");
        //First Pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){  
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        // Middle Line
        // for(int j=1;j<=2*n-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // So we can see that no extra middle line print required as 
        // above for loop code prints it themselves
            //Second Pattern
            int nsp =1;
            int nst = 2*n-3;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){  
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println("");
        }
    }
}