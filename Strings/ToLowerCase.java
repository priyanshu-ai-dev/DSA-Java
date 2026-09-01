class ToLowerCase {
    public String toLowerCase(String s) {
        String output ="";
        for(char c : s.toCharArray()){
            if(c>='A'&&c<='Z'){
                output = output + (char)(c+32);
            }
            else{
                output = output + c;
            }
        }
        return output;
    }
}