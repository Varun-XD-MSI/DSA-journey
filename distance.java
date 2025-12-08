public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    double dist_covered = mpg * fuelLeft;
    if(dist_covered >= distanceToPump){
      return true;
    }
    else{
      return false;
    }
    
    
    
  }

}