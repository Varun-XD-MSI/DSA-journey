import java.util.Scanner;

public class spin_the_wheel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            
        int max_num  = Integer.MIN_VALUE;
            
        
        
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int j = 1;
        int arr[] = new int[l];
        for(int i = 0;i<arr.length;i++){
            arr[i] = (a+j*b)%l;
            j++;
        }
        for(int k = 0;k<arr.length;k++){
            if(arr[k]>max_num){
                max_num = arr[k];

            }
        }
        
        System.out.println(max_num);
        }
    
        

    

    }
    
}
