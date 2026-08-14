class RotateArray {
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int n = arr.length;
        System.out.println("Here is your original array:");
        obj.display(arr);
        int rf = 2;
        rf = rf % n;
        obj.Reverse(arr, 0 , rf - 1);
        obj.Reverse(arr, rf , n - 1);
        obj.Reverse(arr, 0 , n - 1);
        System.out.println("Here is your rotated array "+"by "+rf+" factor of rotation:");
        obj.display(arr);
    }
}
