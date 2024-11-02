package Basics.Recursion;

public class Permutation {
    public static void main(String a[]){
        System.out.println(getPermuationViaFunctionalWay(4));
        System.out.println(getPermuationViaParWay(4,1));
    }

    /* Via Functional way */
    public static int getPermuationViaFunctionalWay(int n ){
        if(n == 0)
            return 1;
        else 
            return n * getPermuationViaFunctionalWay(n-1);
    }

    /* Via Parameterised way */
    public static int getPermuationViaParWay(int n, int product){
        if(n < 1)
            return product;
        else 
            return getPermuationViaParWay(n-1, product*n);
    }
}
