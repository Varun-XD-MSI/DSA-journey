import java.util.Scanner;

public class some_sample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
        int legs = sc.nextInt();
           int c = legs / 4;
        
        
        
        if(legs%4 == 2 ){
                c++;
                System.out.println(c);
            }
        else if(legs % 4 == 0){
                System.out.println(c);
                
            }
            

       

        
    }
    
}


        
   

    
}
