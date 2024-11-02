package Basics.Maths;

import java.util.ArrayList;

public class AllDivisorsOfNumber {
    public static void main(String a[]){
        Object[] data = getAllDivisors(36);
        for(Object obj : data){
            System.out.print(obj + " ");
        }

        Object[] datas = getAllDivisorsOptimal(36);
        for(Object obj : datas){
            System.out.print(obj + " ");
        }
    }

    /*
     * Brute Force
     * Time complexity : O(N)
     * Space complexity : O(N)
     */
    public static Object[] getAllDivisors(int data){
        ArrayList<Integer> finalResult = new ArrayList<Integer>();

        for(int i = 1; i <= data ; i++){
                if(data % i == 0){
                    finalResult.add(i);
                }
        }

        return finalResult.toArray();
    }

    /*
     * Optimal
     * Time complexity : O(sqrt(N))
     * Space complexity : O(2*sqrt(N))
     */
    public static Object[] getAllDivisorsOptimal(int data){
        ArrayList<Integer> finalResult = new ArrayList<Integer>();

        for(int i = 1; i <= Math.sqrt(data) ; i++){
                if(data % i == 0){
                    finalResult.add(i);
                    if ( data / i != i){
                        finalResult.add(data / i);
                    }
                } 
        }

        return finalResult.toArray();
    }
}
