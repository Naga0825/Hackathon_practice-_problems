import java.util.Scanner;
class MissingNo{
    public static void main(String[] args){
        int arr[] = {1,3,2,4};
        int n = arr.length+1;
        int total_sum = n*(n+1)/2;
        for(int i =0;i<arr.length;i++){
            total_sum-=arr[i];
        }
        System.out.println(total_sum);
    }
}
