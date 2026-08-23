public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean result = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                int next  = i+1;
                int snext = i+2;
                if(next<arr.length&& snext<arr.length&&arr[next]%2!=0&&arr[snext]%2!=0){
                    result = true;
                }
            }
        }
        return result;
    }
}
