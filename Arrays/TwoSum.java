// Given an array of integers nums and an integer target, return indices of
//  the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and
//  you may not use the same element twice.
// You can return the answer in any order.
import java.util.Scanner;
class TwoSum{
    public static void twoSum(int []nums , int target){
        // int arr[]=new int[2];
        int n= nums.length;
        for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    // arr[0]=i;
                    // arr[1]=j;
                    System.out.println("["+i+" , "+j+"]");
                    break;
                }
             }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size ;
        System.out.println("Enter size of the array:");
        size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter elements of the array :");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target sum:");
        int target = sc.nextInt();
        twoSum(nums, target);
    }
}