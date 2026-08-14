class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int ArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            ArraySum += arr[i];
        }
        int required = total - ArraySum;
        System.out.println("Required Number: " + required);
    }
}
