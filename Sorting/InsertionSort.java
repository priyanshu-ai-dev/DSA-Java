import java.util.Scanner;
public class InsertionSort {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println("");
    }
    public static void Sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th"+" element of the array:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Input Array:");
        display(arr);
        Sort(arr);
        System.out.println("Output Array:");
        display(arr);
        sc.close();
    }
}
