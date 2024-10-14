package Maths;

public class PalindromNumber {
    public static void main(String a[]){
        System.out.println(123211 == isPalindrome(12321));
    }

    public static int isPalindrome(int data){
        int reverseNumber = 0;
        while(data > 0 ){
            int lastDigit = data % 10;
            data = data / 10;
            reverseNumber = reverseNumber*10 + lastDigit;
        }
        return reverseNumber;
    }
}
