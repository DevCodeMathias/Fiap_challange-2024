package Model;

public class User {
   private String UserId;
   private String Name;
   private  int Points;

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public int getPoints() {
      return Points;
   }

   public void setPoints(int points) {
      Points = points;
   }
}
