class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String input="";
        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                input = input + (char)(c+32);
            }
            else if(c >= 'a' && c <= 'z'){
                input = input + c ;
            }
            else if(c >= '0' && c <= '9'){
                input = input + c;
            }
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}