import java.util.Scanner;

public class Pacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int prevtime = 0;
            int prevpos = 0;
            int points = 0;
            for (int i = 1; i <= n; i++) {
                int init_time = sc.nextInt();
                int init_pos = sc.nextInt();
                int time_gap = init_time - prevtime;
                int parityNeeded = (prevpos == init_pos ? 0 : 1);
                if (time_gap % 2 == parityNeeded) {
                    points += time_gap;
                } else {
                    points += (time_gap - 1);
                }
                prevpos = init_pos;
                prevtime = init_time;
            }
            int rest_points = m - prevtime;
            points += rest_points;

            System.out.println(points);
        }
        
    }
}

