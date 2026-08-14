import java.util.Scanner;
public class CountBit {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
         int n = sc.nextInt();
         int count = 0;
         while(n!=0){
            int value = n&1;
            if(value==1){
                count++;
            }
            n= n>>>1;

         }
         System.out.println(count);
         sc.close();
    }
}
