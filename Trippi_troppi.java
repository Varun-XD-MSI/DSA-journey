import java.util.Scanner;

public class Trippi_troppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();

            String first = s1.substring(0,1);
            String second = s2.substring(0,1);
            String third = s3.substring(0,1);

            String result = String.join("",first,second,third);
        System.out.println(result);
        
        }
        sc.close();
       


        
        
    }
    
}
