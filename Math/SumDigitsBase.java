public class SumDigitsBase {
    public int sumBase(int n, int k) {
        // String s ="";
        int sum=0;
        int rem = 0;
        while(n>0){
            rem = n % k;
            sum += rem;
            n = n / k;
        }
        // String reversed = new StringBuilder(s).reverse().toString();

        // int x = Integer.parseInt(reversed);
        // int sum = 0;
        // while(x>0){
        //     int digit = x%10;
        //     sum+=digit;
        //     x = x/10;
        // }
        return sum;
    }
}
