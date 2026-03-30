import java.util.Scanner;
import java.util.Arrays;
class RotateLeft{
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};
        int k = 12;
        k=k%arr.length;
        for(int j=1;j<=k;j++){
            int temp = arr[0];
        for(int i =1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
          arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
