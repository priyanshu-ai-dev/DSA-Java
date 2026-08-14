import java.util.Scanner;
class FloydTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            
            System.out.println("");
        }
    }
}