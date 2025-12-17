import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        int sum  = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        if(dist>5){
            while(sum<dist){
                sum+=5;
                count++;
            }

        

        }
        else{
            count++;
        }
        System.out.println(count);


         
    }
    
}
