import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to be reversed: ");
        int num = sc.nextInt();
        int digit;
        int rev=0;
        while(num>0){
            digit = num%10;
            rev= rev*10+digit;
            num /=10;
        }
        System.out.println("Here is reversed ingeger: "+rev);
        sc.close();
    }   
}
