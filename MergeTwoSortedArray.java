import java.util.Scanner;
import java.util.*;
class MergeTwoSortedArray{
    public static void main(String[] args){
        int a[] ={4,5,6,7,8};
        int b[] ={1,2,3};
        int c[] = new int[a.length+b.length];
        int i =0;
        int j= 0;
        int k= 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;  
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=a[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(c));
    }
}
