class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        // TLE Error
        // for(int i =0;i*i<=num;i++){
        //     if(i*i == num){
        //         return true;
        //     }
        // }
        // return false;
        // Working Solution 1 Binary Search Method
        if (num < 1) return false;
        
        long lo = 1, hi = num;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long sq = mid * mid;
            
            if (sq == num) {
                return true;
            } else if (sq < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;


        // Working Solution 2
        // if (num < 1) return false;
        // long x = num;
        // while (x * x > num) {
        //     x = (x + num / x) / 2;
        // }
        // return x * x == num;
    }
}