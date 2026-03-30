import java.util.Scanner;
class AllPairs{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int max_sum=0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                int sum =0;
                sum+=arr[i]+arr[j];
                max_sum=Math.max(sum,max_sum);
            }
        }
         System.out.println(max_sum);
    }
}
