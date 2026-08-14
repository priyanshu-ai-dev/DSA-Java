import java.util.Scanner;
class NumberAltAlphabetPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Here is Your Program's Pattern:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                System.out.print(j+" ");
                }
                else{
                    System.out.print((char)(j+64)+" " );
                }
            }
            System.out.println("");
        }
    }
}