import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
    int[] arr = {3,2,1};
    CyclicSortWHile(arr);
        // CyclicSortFor(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSortFor(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i >arr[i]){
                swap(arr,i,arr[i]-1);
            }
            else
                i++;
        }
    }
    static void CyclicSortWHile(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
