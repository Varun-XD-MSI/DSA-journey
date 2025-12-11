public class Binary {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int res = a + b;
        String binary = "";
        
        
        while(res>=1){
        int a1 = res%2;
        binary += a1;
        res/=2;
        
        
        
    
        
      

    }
    String finalbinary = new StringBuilder(binary).reverse().toString();
    System.out.println(finalbinary);
    
    }
    
}

