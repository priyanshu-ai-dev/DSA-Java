import java.util.Scanner;
class PyramidPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Here is your featured pattern: ");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){  
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){   
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}