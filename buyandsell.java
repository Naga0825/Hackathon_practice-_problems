import java.util.Scanner;
class Array{
    public static void main(String[] args){
        int min_price=Integer.MAX_VALUE;
        int max_profit=0;
        int arr[] = {7,1,5,3,6,4};
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min_price)
            min_price = arr[i];
            else {
            int profit = arr[i] - min_price;
            max_profit = Math.max(profit,max_profit);
            }
        }
        System.out.println(max_profit);
    }
}
