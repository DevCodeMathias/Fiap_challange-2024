package Model;

import java.awt.*;

public class User {
   private String UserId;
   private String Name;
   private String Position;

   public String getName() {
      return Name;
   }

   public User(String Name, String Position){
      this.Name = Name;
      this.Position = Position;
   }

   public void setName(String name) {
      Name = name;
   }

   public String getPosition() {
      return Position;
   }

   public void setPosition(String position) {
      Position = position;
   }

}
