import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check:");
        int x = sc.nextInt();

        int org = x;

        if (x < 0) {
            System.out.println("Not Palindrome Number");
            return;
        }

        int rev = 0;

        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        if (org == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }

        sc.close();
    }
}