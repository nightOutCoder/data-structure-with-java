package LeetCode.BitManu;

import java.util.HashMap;
import java.util.Map;

public class LC136 {
    static int[] data = {2,2,1};
    public static void main(String[] args) {

        System.out.println(getSingleNumberViaMap(data));
        System.out.println(getSingleNumber(data));
    }


    public static int getSingleNumberViaMap(int[] inputData){
    int result = 0;

    Map<Integer, Integer> data = new HashMap<Integer,Integer>();

    /*
        * O(N * log m) -> m is size of map
    */
    for(int element : inputData){
        if(data.containsKey(element)){
            data.put(element, data.get(element)+1);
        } else {
            data.put(element , 1);
        }
    }

    /*
        * O(m) - m is size of map
    */
    for(Map.Entry<Integer,Integer> i : data.entrySet()){
        if(i.getValue() < 2)
        result = i.getKey();
    }

        /* Total Time : complexity
         * (N *  log m) + O(m)
         * 
         * Space : O(m)
        */

     return result;
}


    /**
    * 
    * TC - O(n) 
    * SC - O(1)
    *
    */
    public static int getSingleNumber(int[] inputData){
        int xor = 0;
        for(int element : inputData){
            xor = xor ^ element;
        }
        return xor;
    }


}
