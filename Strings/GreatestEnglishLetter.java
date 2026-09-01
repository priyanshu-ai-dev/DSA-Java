class GreatestEnglishLetter {
    public String greatestLetter(String s) {
        boolean[] seen = new boolean[52]; // 0-25 for lowercase, 26-51 for uppercase
        
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                seen[c - 'a'] = true;
            } else {
                seen[26 + (c - 'A')] = true;
            }
        }
        
        for (char c = 'Z'; c >= 'A'; c--) {
            if (seen[26 + (c - 'A')] && seen[c - 'A']) {
                return String.valueOf(c);
            }
        }
        
        return "";
    }
}