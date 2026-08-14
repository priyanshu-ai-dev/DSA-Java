import java.util.Scanner;
class ReverseTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        int ext = 65;
        for (int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                // System.out.print("* ");
                // System.out.print((char)(j+64)+" " );
                // System.out.print(j+" ");
                // System.out.print((char)(j+96)+" ");
                System.out.print((char)(ext) +" ");
            }
            ext++;
            System.out.println("");
        }
    }
}