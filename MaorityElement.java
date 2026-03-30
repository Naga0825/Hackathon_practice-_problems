import java.util.Scanner;
class MaorityElement{
    public static void main(String[] args){
        int [] arr ={3,2,3,2,2,3,3};
        int candidate=0;
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(count==0)
            candidate=arr[i];
            if(candidate==arr[i])
            count++;
            else 
            count--;
        }
        System.out.println(candidate);
    }
}
