import java.util.Scanner;
public class SelectionSort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+"th element of the array :");
             arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<size-1;i++){
            int mindex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[mindex]){
                    mindex =j;
                }
            }
            temp=arr[mindex];
            arr[mindex] = arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println("");
        sc.close();
    }
}
