import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int lb = Math.max(l, -m);
            int ub = Math.min(0, r - m);

            int lp = lb; 
            int rp = lp + m;

            System.out.println(lp + " " + rp);
        }
        sc.close();
    }
}
