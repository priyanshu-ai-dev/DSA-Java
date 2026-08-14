import java.util.Scanner;
class BinaryTraingle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        // int a = 1;
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            // a=1;
            for(int j=1;j<=i;j++){
                // if(i%2==0){
                //     a=0;
                // }
                // System.out.print(a+" ");
                // if(a==1){
                //     a=0;
                // }
                // else{
                //     a=1;
                // }
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println("");
        }
    }
}