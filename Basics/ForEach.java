public class ForEach{
    public static void main(String[] args) {
        int [] arr ={5,8,2,6,9};
        for(int ele : arr){
            ele*=2;
            System.out.println(ele);
        }
        // Difference between forEach loop and for loop
        // Basically in for each loop , temporary variable is stored for 
        // traversal and therefore if you try to change something in the 
        // array with for each loop , you won't be able to do so 
        // Below is main for loop that shows nothing changed even 
        // you tried to change each array member by its double 
        for(int i =0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}