import java.util.Scanner ;
class Array{
    public static boolean twoSum(int[] arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target)
                  return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] arr = {2,7,9,11};
        int target = 9;
        boolean ans = twoSum(arr,target);
        System.out.println(ans);
    }
}
