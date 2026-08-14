
import java.util.Scanner;

class AlphaTriangleFlipped {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int ext = 65;
        System.out.println("Here is Your Program's Pattern:");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if ((i + j) >= (n + 1)) {
                    System.out.print((char) ext + " ");
                } else {
                    System.out.print("  ");
                }
            }
            ext++;
            System.out.println("");
        }
    }
}
