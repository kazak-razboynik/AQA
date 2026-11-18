package practice_4;

public class forIf {
    public static void for1(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void for2(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void for3(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void for4(int n){
        boolean isPrime = true;
        if (n <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }
        System.out.println(isPrime);
    }

    public static void for5(){
        for (int i= 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
