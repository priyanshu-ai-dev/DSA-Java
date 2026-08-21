public class SecondLargestDigit {
    public int secondHighest(String s) {

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int digit = ch - '0';

                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                }
                else if (digit > secondLargest && digit < largest) {
                    secondLargest = digit;
                }
            }
        }

        return secondLargest;
    }
}
