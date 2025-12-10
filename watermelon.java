import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        

        
        int w = sc.nextInt();
        if(w == 2 || w == 1 || w ==0){
            System.out.println("NO");
        }
        for(int i =1;i<w;i++){
            if(i%2 == 0){
                int j = w - i;
                if(j%2 == 0){
                    System.out.println("YES");
                    break;
                }
                else{
                    System.out.println("NO");
                    break;
                }
            }
            
        }

        
        

        
        
    }
    
}

