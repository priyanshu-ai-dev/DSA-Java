/*  # # # * * * *
    # # * * * * #
    # * * * * # #
    * * * * # # #    */
   // Rhombus Pattern
   import java.util.Scanner;
   class RhombusPatternVariable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = n;
        for(int i=1;i<=n;i++){
            for(int j= 1;j<=nsp;j++){
                 System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            System.out.println("");
        }
    }
   }