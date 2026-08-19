public class BaseSeven {
       public String convertToBase7(int num) {
        if (num == 0) return "0";
        
        boolean isNegative = num < 0;
        long n = Math.abs((long) num);   // avoid overflow when num = Integer.MIN_VALUE
        
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 7);
            n /= 7;
        }
        
        if (isNegative) sb.append('-');
        
        return sb.reverse().toString();
    }
}
