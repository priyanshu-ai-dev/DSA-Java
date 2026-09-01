class AddingSpacesString {
    public String addSpaces(String s, int[] spaces) {
        int noofspaces=spaces.length;
        int count = 1;
        char arr [] = s.toCharArray(); 
        int stringlength = arr.length;
        int arrindex = stringlength-1;
        char arr1[] = new char[stringlength+noofspaces];
        int spaceindex = spaces.length - 1;
        for(int i = arr1.length-1;i>=0;i--){
            if(spaceindex>=0 && i==(spaces[spaceindex]+noofspaces-count)){
                arr1[i]=' ';
                count++;
                spaceindex--;
            }
            else{
                arr1[i]=arr[arrindex];
                arrindex--;
            }
        }
        String str = String.valueOf(arr1);
        return str;
    }
}