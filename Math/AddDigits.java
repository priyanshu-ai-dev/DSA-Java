import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        while (n >= 10) {

            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem;
                n /= 10;
            }

            n = sum;
        }

        System.out.println("Answer: " + n);

        sc.close();
    }
}