import java.util.Scanner;
class OddNumberTraingle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int ext = 1;
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            ext =1;
            for(int j=1;j<=i;j++){
                System.out.print(ext+" ");
                ext+=2;
            }
            System.out.println("");
        }
    }
}