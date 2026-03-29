import java.util.Scanner;
class DuplicateInArray{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,5};
        for(int i =0;i<arr.length-1;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j])
                 count++;
            }
            if(count==2)
            System.out.println(arr[i]);
        }
    }
}
