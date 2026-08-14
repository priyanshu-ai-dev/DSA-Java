import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for prime:");
        int num = sc.nextInt();
        int count = 0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                count++;
            }
        }
        if(num<=1){
            System.out.println("Not Prime");
        }
        else if(num==2||count==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}
