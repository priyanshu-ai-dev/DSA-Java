import java.util.Scanner;
class SegregateZeroOne {
       void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
       public static void main(String[] args) {
           Scanner sc =  new Scanner(System.in);
           System.out.println("Enter the array size:");
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++){
            System.out.println("Enter "+i+"th element of the array: ");
            arr[i]=sc.nextInt();
           }
        SegregateZeroOne obj =  new SegregateZeroOne();
        System.out.println("Your input array : ");
        obj.display(arr);
        int zeros = 0;
        int ones = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
            else{
                ones++;
            }
        }
        for(int i = 0;i<zeros;i++){
            arr[i]=0;
        }
        for(int i = zeros;i<n;i++){
            arr[i]=1;
        }
        System.out.println("Now your array : ");
        obj.display(arr);
       } 
}
