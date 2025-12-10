import java.util.Scanner;

public class Way_toolong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
             String s = sc.next();
        int l = s.length();
        if(l>10){
            String s1 = s.substring(0,1);
            String s2 = s.substring(l-1);

            String s3 = String.valueOf(l-2);

            String res = s1 + s3 + s2;
            System.out.println(res);
        }
        else{
            System.out.println(s);
        }
        }


       

        


        
        
        
        
    }
    





    
}
