class DuplicateInteger {
 public static void main(String[] args) {

        int[] arr = {5, 1, 3, 4, 2, 6};
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(
                            "Duplicate element " + arr[i]
                            + " found at index " + i
                            + " and " + j
                    );
                    return;
                }
            }
        }

        System.out.println("No duplicate found");
    }
}
