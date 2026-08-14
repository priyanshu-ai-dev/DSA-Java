// public class PlusOne {
//     static int[] ArrayCounter(int arr[]){
//         for(int i=arr.length;i>=0;i--){
//               if(arr[i]!=9){
//                 arr[i]++;
//                 return arr;
//               }
//               arr[i]=0;
//             }
//             int [] result = new int[arr.length+1];
//             result[0]=1;
//             return result;

//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3};
//         int arr2[]={1,2,9};
//         int arr3[]={9,9,9};
//         ArrayCounter(arr);
//         ArrayCounter(arr2);
//         ArrayCounter(arr3);
//     }
// }

import java.util.Arrays;

public class PlusOne {

    static int[] ArrayCounter(int arr[]) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        int[] result = new int[arr.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 9 };
        int arr3[] = { 9, 9, 9 };

        System.out.println(Arrays.toString(ArrayCounter(arr)));
        System.out.println(Arrays.toString(ArrayCounter(arr2)));
        System.out.println(Arrays.toString(ArrayCounter(arr3)));
    }
}