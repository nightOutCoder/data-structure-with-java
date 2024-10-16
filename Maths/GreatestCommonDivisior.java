package Maths;

public class GreatestCommonDivisior {
    public static void main(String a[]){
        System.out.println(gcdBruteForce(24,40));
        System.out.println(gcdBruteForce(12,9));

        System.out.println(gcdBetter(24,40));
        System.out.println(gcdBetter(12,9));

        System.out.println(gcdOptimal(24,40));
        System.out.println(gcdOptimal(12,9));
    }


    /*
     * Bruteforce
     * 
     * TC - O(min(n,m))
     * SC - O(1) 
    */
    public static int gcdBruteForce(int input1, int input2){
        int gcd = 1;

        for(int i = 1; i < Math.min(input1, input2); i++) {
            if(input1 % i == 0 && input2 % i == 0){
               gcd = i; 
            }
        }
        return gcd;
    }


    /*
     * Better
     * 
     * TC - O(min(n,m))
     * SC - O(1) 
    */
    public static int gcdBetter(int input1, int input2){
        int gcd = 1;

        for(int i = Math.min(input1, input2);  i > 0; i--) {
            if(input1 % i == 0 && input2 % i == 0){
               gcd = i; 
               break;
            }
        }
        return gcd;
    }

    /*
     * optimal
     * 
     * TC - O(logi min(a,b))
     * SC - O(1) 
     * 
     * gcd(a,b) -> gcd(a-b,b) -> ------ gcd(0,b) --> output: b
    */
    public static int gcdOptimal(int input1, int input2){

        while (input1 > 0 && input2 > 0) {
            
            if(input1 > input2){
                input1 = input1 % input2;
            } else {
                input2 = input2 % input1;
            }
        }
        if(input1 == 0)
            return input2;
        else 
            return input1;
    }
}
