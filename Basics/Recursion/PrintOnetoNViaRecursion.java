package Basics.Recursion;

public class PrintOnetoNViaRecursion {

    public static void main(String a[]){
        //print(1,4);
        printViaBackTracking(4,4);
    }

    /*
     * TC - O(n)
     * SC - O(n)
    */
    public static void print(int a, int n){
        if(a > n){
            return;
        }
        System.out.println(a);
        print(a+1, n);
    }

    /*
     * TC - O(n)
     * SC - O(n)
    */
    public static void printViaBackTracking(int a, int n){
        if(a < 1){
            return;
        }
        printViaBackTracking(a-1, n);
        System.out.println(a);
    }
}
