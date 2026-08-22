import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        int num;
        int count;
        int divcount;
        for(int i=left;i<=right;i++){
            num = i;
            count = 0;
            divcount = 0;
            while(num>0){
                int digit = num%10;
                if (digit != 0 && i % digit == 0) {
                    divcount++;
                }
                num=num/10;
                count++;
            }
            if(divcount==count){
                numbers.add(i);
            }
        }
        return numbers;
    }
}
