import java.util.Scanner;
import java.util.Arrays;
class RemoveElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,2,3,4,5};
        System.out.println("Enter target element");
        int target_element = sc.nextInt();
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=target_element){
              arr[j]=arr[i];
              j++;}
        }
        System.out.println(j);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Arrays.copyOf(arr,j)));
    }
}
