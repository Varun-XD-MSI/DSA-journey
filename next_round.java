import java.util.Scanner;

public class next_round {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt(); // particpants
        int k = sc.nextInt(); // place
        int count  = 0;
        int[] points = new int[n];
        
        
        for(int i = 0 ;i<n;i++){
            points[i] = sc.nextInt();
        }
        
        if(n==1){
            if(points[0] > 0){
                System.out.println(1);

            }
            else{
                System.out.println(0);
            }

        
            
        } 
        else{
            for(int i = 0;i<points.length;i++){
            int min = points[k-1];
            
            if(points[i] >= min && points[i]>0){
                count++;
            }
        }
        System.out.println(count);

        }
        
        
























        // for(int i = 0;i<points.length;i++){
        //     int min = points[k];
        //     if(min == 0){
        //         count+=0;
        //         break;
        //     }
        //     if(points[i] >= min){
        //         count++;
        //     }
        // }
        // System.out.println(count);


        
       




        
    }
    
}
