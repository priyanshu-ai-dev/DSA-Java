import java.util.Scanner;
class SecondMaximum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        if (size>=2){
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+"th element of the array: ");
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
       for (int i=0;i<size;i++){
            if (max<arr[i]){
                smax = max;
                max =arr[i];
            }
       }
       System.out.println("Second Maximum: "+ smax);
       System.out.println("First Maximum: "+ max);
       sc.close();
    }
    else{
        System.out.println("Minimum array size is 2.");
    }
    }
    
}