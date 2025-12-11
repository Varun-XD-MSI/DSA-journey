import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int t = sc.nextInt();
        String s1 = "x++";
        String s2 = "x--";
        String s3 = "++x";
        String s4 = "--x";
       
        while (t-->0) {
            String s = sc.next();
            if(s.equalsIgnoreCase(s1)){
                x++;
                
            }
            else if(s.equalsIgnoreCase(s2)){
                x--;
                
            }
            else if(s.equalsIgnoreCase(s3)){
                ++x;
                
            }
            else if(s.equalsIgnoreCase(s4)){
                --x;
                
            }


        
        }
        System.out.println(x);
        

    }
    
}
