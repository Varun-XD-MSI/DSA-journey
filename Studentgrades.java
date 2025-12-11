
public class StudentFinalGrade{
2
    
3
    public static int finalGrade(int exam, int projects){
4
      if(exam>90 || projects>10){
5
        return 100;
6
      }
7
      else if(exam>75 && projects>=5){
8
        return 90;
9
      }
10
      else if(exam>50 && projects>=2){
11
        return 75;
12
      }
13
      else{
14
        return 0;
15
      }
16
       
17
    }
18
}
 Excelle