import java.util.Scanner;

public class bear_big_brothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int count = 0;
        while(limak<=bob){
            limak = limak*3;
            bob = bob*2;
            count++;

        }
        System.out.println(count);
    }
    
}
