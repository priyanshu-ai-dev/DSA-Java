class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1; // current digit length (1, 2, 3, ...)
        long count = 9; // how many numbers have this many digits
        long start = 1; // first number with this many digits

        // Step 1: find the right digit-length group
        while (n > digitLength * count) {
            n -= (int) (digitLength * count);
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Step 2: find the exact number within that group
        long num = start + (n - 1) / digitLength;

        // Step 3: find the exact digit within that number
        int digitIndex = (int) ((n - 1) % digitLength);
        String numStr = Long.toString(num);

        return numStr.charAt(digitIndex) - '0';
    }
}
