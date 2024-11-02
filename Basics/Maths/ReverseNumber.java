package Basics.Maths;

public class ReverseNumber {
    public static void main(String a[]){
        System.out.println(reverseNumber(2458));
    }

    public static int reverseNumber(int data){
        int reverseNumber = 0;
        while(data > 0 ){
            int lastDigit = data % 10;
            data = data / 10;
            reverseNumber = reverseNumber*10 + lastDigit;
        }
        return reverseNumber;
    }
}
