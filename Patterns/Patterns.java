public class Patterns {
    public static void main(String a[]){
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern6(5);
        //pattern7(5);
        //pattern8(5); 
        //pattern9(5) 
        //pattern10(5);
          pattern11(5);
    }
    public static void pattern1(int n){
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i = 0; i < n ; i++){
        for(int j = n; j > i; j--){
            System.out.print("* ");
        }
        System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (n-i-1)*2+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }

    public static void pattern10(int n){
        for(int i = 1; i <= 2*n-1; i++){

            int end = i;
            if(i > n){
                end = 2*n-i;
            }
            for(int j = 1; j <= end; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        int start = 1;
        for(int i = 0; i < n ; i++){

            if(i % 2 == 0){
                start = 1;
            } else {
                start = 0;
            }
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
