package practice_4;

public class whileIf {
    public static void while1(int n){
        int result = 1;
        int count = 1;

        while (n >= count) {
            result =  result * count;
            count++;
        }

        System.out.println(result);
    }

    public static void while2(int n){
        int count = 1;
        while (n >= count) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }

    public static void while3(int n){
        int count = 1;
        int num = n;

        while (n >= count) {
            System.out.println(num);
            count++;
            num--;
        }
    }
}
