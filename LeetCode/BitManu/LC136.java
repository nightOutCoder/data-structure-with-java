package LeetCode.BitManu;

import java.util.HashMap;
import java.util.Map;

/*
 *  Single Number
*/
public class LC136 {
    static int[] data = { 2, 2, 1 };

    public static void main(String[] args) {
        int[] result = getViaAdditionalArray(data);
        for(int i = 0; i < result.length; i++){
            if(result[i] != -1 && result[i] < 2){
                System.out.println(data[i]+" came "+result[i] +" times");
            }
        }
        System.out.println(getSingleNumberViaMap(data));
        System.out.println(getSingleNumber(data));
    }


    /**
     * Time Complexity : O(n2)
     * Space Complexity : O(n) + O(1) ==> O(n)
    */
    public static int[] getViaAdditionalArray(int[] inputData) {
        int[] storeArray = new int[inputData.length];
        int isVisited = -1;

        for(int i = 0 ; i < inputData.length; i ++){
            int count = 1; 
            for(int j = i+1; j < inputData.length; j++){
                if(inputData[i] == inputData[j]){
                    count++;
                    storeArray[j] = isVisited;
                }
            }
            if(storeArray[i] != isVisited){
                storeArray[i] = count;
            }
        }
        return storeArray;
    }


    public static int getSingleNumberViaMap(int[] inputData) {
        int result = 0;
        Map<Integer, Integer> data = new HashMap<Integer, Integer>();
        /*
         * O(N * log m) -> m is size of map
         */
        for (int element : inputData) {
            if (data.containsKey(element)) {
                data.put(element, data.get(element) + 1);
            } else {
                data.put(element, 1);
            }
        }
        /*
         * O(m) - m is size of map
         */
        for (Map.Entry<Integer, Integer> i : data.entrySet()) {
            if (i.getValue() < 2)
                result = i.getKey();
        }
        /*
         * Total Time : complexity
         * (N * log m) + O(m)
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
    public static int getSingleNumber(int[] inputData) {
        int xor = 0;
        for (int element : inputData) {
            xor = xor ^ element;
        }
        return xor;
    }

}
