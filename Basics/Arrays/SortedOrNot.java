package Basics.Arrays;
public class SortedOrNot {
    static int[] data = {1,2,3,4,5,6,9};
    public static void main(String[] args) {
        System.out.println(isSorted(data));
    }

    static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length ; i++){
            if(arr[i-1] <= arr[i]){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
