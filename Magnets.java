import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        
        
        String[] arr = new String[t];
        for(int i = 0;i<t;i++){
            arr[i] = sc.next();
        }
        for(int j = 1;j<arr.length;j++){
            if(!arr[j].equals(arr[j-1])){
                count++;
            }
        }
        System.out.println(count);
        
        
        
        }
        

        

    }
    
