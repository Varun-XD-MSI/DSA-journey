import java.util.Scanner;

public class Ashmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            
        
        int l = sc.nextInt();

        String res = "";
        
        for(int i = 0;i<l;i++){
            String ai = sc.next();
            String left = ai + res;
            String right = res + ai;
            if(left.compareTo(right)<0){
                res = left;

            }
            else{
                res =  right;
            }

        }
        System.out.println(res);
    }
        
        
            
            
            
       
        
        }
        



    
    
    }

    

