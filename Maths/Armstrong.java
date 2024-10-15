package Maths;

public class Armstrong {
    public static void main(String a[]){
        System.out.println(371==isArmstrong(371));
    }

    /**
     * Space Complexity - O(1)
     * Time Complexity - O(log10N + 1)
     */
    public static int isArmstrong(int data){
        int finalResul = 0;
        while(data > 0 ){
            int lastDigit = data % 10;
            finalResul +=lastDigit * lastDigit * lastDigit;
            data = data / 10;
        }
        return finalResul;
    }
}
