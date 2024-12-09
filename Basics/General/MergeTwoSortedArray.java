package Basics.General;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,8,10,11,12,16};

        int s1 = a1.length;
        int s2 = a2.length;

        int[] result = new int[s1+s2];
        int i=0;
        int j=0;
        int k=0;

        while(i < s1 && j < s2){
            if(a1[i] < a2[j]){
                result[k] = a1[i];
                i++;
                k++;
            } else {
                result[k] = a2[j];
                j++;
                k++;
            }
        }
        while(i < s1){
            result[k]= a1[i];
            i++;
            k++;
        }
        while(j < s2){
            result[k] = a2[j];
            j++;
            k++;
        }


        for (int data : result) {
            System.out.println(data);
        }
    }
}