import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            int q3 = sc.nextInt();
            if(q1 == 1 && q2 == 1 || q1 ==1 && q3 == 1 || q2 == 1 && q3 ==1 || q1 == 1 && q2 == 1 && q3 ==1 ){
                count += 1;
                

            }
       

        }
         System.out.println(count);
        
            
        
    }
}

