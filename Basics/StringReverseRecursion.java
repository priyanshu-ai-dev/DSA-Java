
public class StringReverseRecursion {

    public static void main(String[] args) {
        String name = "ABC";
        StringReverse(name,0);
    }

    private static void StringReverse(String name,int i) {
        if(i==name.length()){
            return;
        }
        StringReverse(name,i+1);
        System.out.print(name.charAt(i));

    }
}
