public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
      int total_goals = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
      return total_goals;
    
        
    }
    public static void main(String[] args){
      System.out.println(goals(5,10,2));
    }
  
}