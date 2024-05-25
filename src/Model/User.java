package Model;

public class User {
   private String UserId;
   private String Name;
   private  int Points;

   public String getName() {
      return Name;
   }

   public User(String Name){
      this.Name = Name;
      this.Points = 0;
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

   @Override
   public String toString() {
      return   Name +
              ", Points: " + Points;
   }
}
