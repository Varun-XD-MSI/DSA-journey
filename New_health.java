public class Game {
  
  public static int combat(int health, int damage) {
    if(health<damage){
      return 0;
    }
    int new_health = health - damage;
    
    
    return new_health;
  }
}
