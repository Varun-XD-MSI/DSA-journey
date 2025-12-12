import java.util.Scanner;

public class Square_fill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long res1 = (n + a - 1) / a;  
        long res2 = (m + a - 1) / a;  

        long res = res1 * res2;

        System.out.println(res);
    }
}
