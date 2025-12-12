public class XO {
  
  public static boolean getXO (String str) {
    String s1 = "x";
    String s2 = "o";

    char[] arr = str.toCharArray();
    int count_x = 0;
    int count_o = 0;

    for(int i = 0; i < arr.length; i++){
      char s = arr[i];
      String res = Character.toString(s);

      if(res.equalsIgnoreCase(s1)){
        count_x++;
      }
      else if(res.equalsIgnoreCase(s2)){
        count_o++;
      }
    }

    
    if(count_x == count_o){
      return true;
    } 
    else {
      return false;
    }
  }
}
