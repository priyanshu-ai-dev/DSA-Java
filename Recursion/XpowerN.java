package Recursion;

class XpowerN {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            return 1.0 / fastPow(x, -N);   // invert the RESULT, not x
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
