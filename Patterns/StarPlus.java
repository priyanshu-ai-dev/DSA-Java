import java.util.Scanner;
class StarPlus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only odd n:");
        int n = sc.nextInt();
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==((n/2)+1)||j==((n/2)+1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}