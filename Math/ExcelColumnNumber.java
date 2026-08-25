class ExcelColumnNumber {
    public int titleToNumber(String columnTitle) {
         int sum = 0;
         int size = columnTitle.length();
         int i = 0;
         int power = size -1;
         while(size>0){
            
            sum = sum + ((int) columnTitle.charAt(i) -64 )* (int)Math.pow(26, power);
            i++;
            power --;
            size--;
         }
         return sum;
    }
}