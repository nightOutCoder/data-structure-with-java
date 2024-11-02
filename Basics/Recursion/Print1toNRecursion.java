package Basics.Recursion;

public class Print1toNRecursion {
    public static void main(String a[]){
        System.out.println(viaLoop(3));
        System.out.println(viaSummation(3));
        System.out.println(getFunctionalWay(3));
        System.out.println(getParameterised(3,0));
    }

    public static int viaLoop(int n){
        int sum = 0;
        for(int i = 1; i<=3; i++){
            sum +=i;
        }
        return sum;
    }

    public static int viaSummation(int n){
        return n * (n+1)/2;
    }

    /* Via Function way recursion */
    public static int getFunctionalWay(int n){
        if(n == 0){
            return 0;
        }
        return n + getFunctionalWay(n-1);
    }

    /* Via Parameterised way recursion */
    public static int getParameterised(int i, int sum){
        if(i < 0){
            return sum;
        }
        return getParameterised(i-1, sum + i);
    }
}


