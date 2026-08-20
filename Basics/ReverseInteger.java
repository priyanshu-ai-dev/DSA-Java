class ReverseInteger {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int digit = x % 10; 
            x /= 10;
            rev = rev * 10 + digit;
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int) rev;
    }
}
// Earlier VS Code Solution -

// import java.util.Scanner;
// public class ReverseInteger {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integer to be reversed: ");
//         int num = sc.nextInt();
//         int digit;
//         int rev=0;
//         while(num>0){
//             digit = num%10;
//             rev= rev*10+digit;
//             num /=10;
//         }
//         System.out.println("Here is reversed ingeger: "+rev);
//         sc.close();
//     }   
// }
