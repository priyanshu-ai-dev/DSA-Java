import java.util.Scanner;
public class Valid_Perfect_Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i =0;i*i<=num;i++){
            if(i*i == num){
                flag = true;
                System.out.println(num+" is a valid perfect square of "+i);
            }
        }
        if(flag == false){
        System.out.println(num+" is not a valid perfect Square.");
        }
        sc.close();
    }
}
