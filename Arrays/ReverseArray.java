
class ReverseArray {

    // Swap using array reference
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();

        int[] arr = {6, 8, 1, 2, 4, 9};

        System.out.println("Here is your original array:");
        obj.display(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            obj.swap(arr, i, j);
            i++;
            j--;
        }

        System.out.println("Reversed array:");
        obj.display(arr);
    }
}
