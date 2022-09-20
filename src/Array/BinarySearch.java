public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(BinarySearch(arr,6));
    }
    static int BinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length;
        //for ascending order
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }

}
