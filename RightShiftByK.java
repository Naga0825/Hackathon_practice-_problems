import java.util.Scanner;
import java.util.Arrays;
class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        System.out.println("Enter one element");
        int k = sc.nextInt();
        k=k%n;
        for(int j =1;j<=k;j++){
        int temp = arr[arr.length-1];
        for(int i = n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
