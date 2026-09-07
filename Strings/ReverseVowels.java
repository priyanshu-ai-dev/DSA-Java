class ReverseVowels {
    public String reverseVowels(String s) {
        char arr1[] = s.toCharArray();
        String input="aeiouAEIOU";
        String output="";
        for(char c : s.toCharArray()){
            // if(input.contains(c)) showing error and learning part
            if(input.indexOf(c) != -1)
            {
                output = output + c ;
            }
            
        }
        String reversed = new StringBuilder(output).reverse().toString();
        char arr2 [] = reversed.toCharArray();
        int pointer = 0;
        for(int i = 0;i<arr1.length;i++){
            // if(input.contains(arr1[i]))  showing error and learning part
            if(input.indexOf(arr1[i]) != -1)
            {
                arr1[i] = arr2[pointer];
                pointer++ ;
            }
        }
        // String result = new StringBuilder(arr1).toString();
        // return result;
        return new String(arr1);
    }
}