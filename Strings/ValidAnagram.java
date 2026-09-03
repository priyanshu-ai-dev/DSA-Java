class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        int[] freq1 = new int[26];
        char[] arr2 = t.toCharArray();
        int[] freq2 = new int[26];
        for(char c : arr1){
            freq1[c - 'a']++;
        }
        for(char c : arr2){
            freq2[c - 'a']++;
        }
        for(int i = 0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}