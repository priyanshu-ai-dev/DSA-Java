class ReverseWordsInString {

    public String reverseWords(String s) {

        // Reverse the entire string
        s = new StringBuilder(s).reverse().toString();

        StringBuilder result = new StringBuilder();
        StringBuilder intermediate = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c != ' ') {

                intermediate.append(c);

            } else {

                if (intermediate.length() > 0) {

                    result.append(
                        intermediate.reverse()
                    );

                    result.append(' ');

                    intermediate.setLength(0);
                }
            }
        }

        // Process last word
        if (intermediate.length() > 0) {
            result.append(intermediate.reverse());
        }

        // Remove final extra space, if present
        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}