package Recursion;

class XpowerN {
    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        return recurs(x,power);
    }
    public double recurs(double x , long n){
        if(n==0)
            return 1;
        double half = recurs(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }
}
