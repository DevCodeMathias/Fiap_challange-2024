package Model;

import java.awt.*;

public class User {
   private String UserId;
   private String Name;
   private  int Points;

   public String getName() {
      return Name;
   }

   public User(String Name, int Points){
      this.Name = Name;
      this.Points = Points;
   }

   public void setName(String name) {
      Name = name;
   }

   public int getPoints() {
      return Points;
   }

   public int setPoints(int points) {
      Points = points;
      return points;
   }

   @Override
   public String toString() {
      return   Name +
              ", Points: " + Points;
   }
}
