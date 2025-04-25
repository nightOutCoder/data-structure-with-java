package LeetCode.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Main ob = new Main();
        int[] inputData = new int[]{1,2,3};
        int[] resultq = ob.getConcatenation(inputData);
        for(int x: resultq){
            System.out.println("Data is : "+x);
        }
    }
           
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int n = result.length;

        
        for(int i = 0 ; i<nums.length;i++){
            System.out.println(nums[i]);
            System.out.println(result[i]+" -"+nums[i]);
            result[i]=nums[i];
            System.out.println(result[i]+" -"+nums[i]+"--"+i+"44 "+n);
        }

        for(int i = nums.length ; i<2*nums.length;i++){
            System.out.println(nums[i]+"-->"+n);
            System.out.println(result[i]+" -"+nums[i]);
            result[i]=nums[i];
            System.out.println(result[i]+" -"+nums[i]+"--"+i+"44 "+n);
        }
        return result;
    }
}


