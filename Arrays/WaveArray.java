import java.util.Scanner;
class WaveArray{
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            System.out.println("Enter the "+i+"th element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Here is your i  nput array: ");
        display(arr);
        for(int i=0;i<n-1;i+=2){
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= temp;
        }
        System.out.println("Here is your desired array: ");
        display(arr);
        sc.close();
     }
}