package Maths;

public class DigitCount {
    public static void main(String a[]){
        System.out.println(getDigitCount(32));
        System.out.println(getDigitCount_Optimized(32));
    }

    public static int getDigitCount(int data){
        int count = 0;
        while(data > 0 ){
            data = data / 10;
            count++;
        }
        return count;
    }

    /*optimized way
     * TC : O(log10 N)
     * SC : 
    */
    public static int getDigitCount_Optimized(int data){
        int count = 0;
        count = (int)Math.log10(data)+1;
        return count;
    }
}
