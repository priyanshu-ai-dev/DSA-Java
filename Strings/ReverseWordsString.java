class ReverseWordsString {
    public String reverseWords(String s) {
        String result = "";
        String intermediate = "";
        for(char c : s.toCharArray()) {
            if(c != ' ') {
                intermediate += c;
            } else {
                String imrev = new StringBuilder(intermediate).reverse().toString();
                result = result + imrev + " ";
                intermediate = "";
            }
        }
        // Process last word
        String imrev = new StringBuilder(intermediate).reverse().toString();
        result = result + imrev;
        return result;
    }
}