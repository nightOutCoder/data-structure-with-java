package Basics.General;

public class DigitCount {
    public static void main(String[] args) {
        int input = 1654634335;
        DigitCount ob = new DigitCount();
        System.out.println("Digit Count is : "+ob.getDigitCount(input));
    }

    public int getDigitCount(int input){
        int count = 0;
        int temp = input;


        while (temp > 0) {
            temp = temp/10;
            count++;
        }

        return count;
    }
}
