import java.util.Scanner;
class TwoSum{
    public static boolean twoSum(int[] arr,int target){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target)
             return true;
             else if(arr[i]+arr[j]>target)
             j--;
             else
             i++;
        }
    return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,7,9,3};
        System.out.println("enter target value");
        int target = sc.nextInt();
        boolean ans = twoSum(arr,target);
        System.out.println(ans);
    }
}
