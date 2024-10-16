package Recursion;

public class PrintNtoOneViaRecursion {
    public static void main(String a[]){
        //print(4,1);
        printViaBackTracking(1,4);
    }
    
    /*
     * TC - O(n)
     * SC - O(n)
    */
    public static void print(int a, int n){
        if(a < n){
            return;
        }
        System.out.println(a);
        print(a-1, n);
    }

        /*
     * TC - O(n)
     * SC - O(n)
    */
    public static void printViaBackTracking(int a, int n){
        if(a > n){
            return;
        }
        printViaBackTracking(a+1, n);
        System.out.println(a);
    }
}
