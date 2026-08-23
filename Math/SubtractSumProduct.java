public class SubtractSumProduct {
    public int subtractProductAndSum(int n) {
        int digit;
        int product = 1;
        int sum = 0;
        while(n>0){
            digit = n%10;
            product = product *digit;
            sum = sum+digit;
            n=n/10;
        }
        int result = product - sum;
        return result;
    }
}
