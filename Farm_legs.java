import java.util.Scanner;

public class Farm_legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {

            int count = 0;
            int legs = sc.nextInt();

            if (legs == 2) {
                System.out.println(1);
                continue;
            }

            if (legs % 2 != 0) {
                System.out.println(0);
                continue;
            }

            for (int i = 0; i <= legs / 4; i++) {
                int chicken = legs - 4 * i;
                if (chicken % 2 == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

            



        
       

        
    
    

