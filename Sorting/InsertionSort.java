import java.util.Scanner;

public class InsertionSort {
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println("");
    }

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "th" + " element of the array:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array:");
        display(arr);
        sort(arr);
        System.out.println("Output Array:");
        display(arr);
        sc.close();
    }
}
