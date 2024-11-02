package Basics.Maths;

/* A number which is having exactly two factors : 1 and the number it self */
public class PrimeNumber {
    public static void main(String a[]){
        System.out.println(isPrimeNumber(12));
        System.out.println(isPrimeNumberOptimal(12));
    }

    /**
     * Bruteforce
     * 
     * Space Complexity - O(1)
     * Time Complexity - O(n)
     */
    public static boolean isPrimeNumber(int data){
        int count = 0 ;
        for(int i = 1; i <= data; i ++){
            if(data % i == 0){
                count++;
            }
        }
        return count == 2;
    }

    /**
     * optimal
     * 
     * Space Complexity - O(1)
     * Time Complexity - O(sqrt(N))
     */
    public static boolean isPrimeNumberOptimal(int data){
        int count = 0 ;
        for(int i = 1; i*i <= data; i ++){
            if(data % i == 0){
                count++;

                if ( data / i != i){
                    count++;
                }
            } 
        }
        return count == 2;
    }
}
