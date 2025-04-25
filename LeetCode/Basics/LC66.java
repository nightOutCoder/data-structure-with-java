package LeetCode.Basics;

public class LC66 {
    public static void main(String[] args) {
        int[] input = new int[]{ 9,8,7,6,5,4,3,2,1,0 }; 


        LC66 ob = new LC66();
        Long[] resultArray = ob.plusOne(input);
        for(Long data : resultArray){
            System.out.println(data);
        }
    }

    /* plusOne - return as Long[] */
    public Long[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i: digits){
            sb.append(i);
        }
        Long value = Long.parseLong(sb.toString());
        value++;
        Long temp = value;
        int x = String.valueOf(temp).length();
        Long[] result = new Long[x];
        for(int i = x-1;i>=0;i--){
            result[i] = temp % 10;
            temp = temp/10;
        }
        return result;
    }
}
