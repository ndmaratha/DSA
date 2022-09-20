import java.util.ArrayList;
import java.util.List;

public class Finddisapearing {
    static List<Integer> findDisappearedNumbers (int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-i;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap ( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
