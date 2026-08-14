import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for prime:");
        int num = sc.nextInt();
        int countp = 0;
        System.out.println("Prime Numbers in the range of 1 to "+num+" :");
        for (int j = 2; j <= num; j++) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    count++;
                }
            }

            if (j == 2 || count == 0) {
                System.out.println(j);
                countp++;

            }
        }
        System.out.print("Total Prime Numbers in the range of 1 to "+num+" is ");
        System.out.print(countp);
        System.out.println("");
        sc.close();

    }
}
