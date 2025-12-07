import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();
            
                if(s1 == 0 || s2 == 0 || s3 == 0 || s4 == 0){
                    System.out.println("NO");
                    
                    
                }
                else if(s1 == s2 && s1 == s3 && s1 == s4){
                    System.out.println("YES");
                    
                }
                else{
                    System.out.println("NO");
                    
                }
        
            
        }


        

        
    }
    
}




