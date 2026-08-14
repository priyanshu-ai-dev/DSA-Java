import java.util.Scanner;
class StarCross{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only odd n:");
        int n = sc.nextInt();
        if(n%2==0){
            n=n+1;
            System.out.println("OK! Now you tried entering an even no but as the program said to enter only odd no therefore showing result for "+ n);
        }
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||(i+j)==(n+1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}