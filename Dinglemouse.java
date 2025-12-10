public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int cat_year = 0;
    int dog_year = 0;
    
    for(int i = 1;i<=humanYears;i++){
      if(i==1){
        cat_year += 15;
        dog_year += 15;
      }
      else if(i == 2){
        cat_year += 9;
        dog_year += 9;
      }
      else if(i>2){
        cat_year += 4;
        dog_year += 5;
      }
      
    }
    
    
   
    return new int[]{humanYears,cat_year,dog_year};
  }
}

        
    
    

