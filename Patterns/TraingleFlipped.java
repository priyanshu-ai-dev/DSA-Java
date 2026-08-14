import java.util.Scanner;
class TraingleFlipped{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ //n-i spaces 
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){  // i stars 
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}