import java.util.*;
class RemoveDuplicates{
    public static void removeDuplicates(int[] arr){
        Set<Integer> bag = new LinkedHashSet<>();
        for(int i =0;i<arr.length;i++){
            bag.add(arr[i]);
        }
        System.out.println(bag);
        
    }
    public static void main(String[] args){
        int [] arr = {1,2,2,3,3,4,4,5,5,6,6};
        removeDuplicates(arr);
        
    }
}
