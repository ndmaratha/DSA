import jdk.dynalink.beans.StaticClass;

import javax.sound.sampled.Line;
import java.util.Arrays;

public class LInearSerch {
    public static void main(String[] args) {
        int[] arr={3,2,3,4,5};
        int target=(-1);
        System.out.println("array is found at index="+LinearSearch(arr,target));


    }
    static int LinearSearch(int[] arr,int target){
        int i=0;
        while(i<arr.length) {
            if (arr[i] == target) {
                return i;
            } else
                i++;
        }
        return -1;
    }
}
