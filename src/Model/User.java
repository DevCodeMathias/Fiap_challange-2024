package Model;

import java.awt.*;
import java.util.ArrayList;

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

   public  int  evaluateApp(int avaliation, int recomandation ){
      int media = (avaliation + recomandation) /2;
      return media;
   }

   public void requestSuport(String description ){
      ArrayList<String> occurrence = new ArrayList<>();
      occurrence.add(description);
      System.out.println("Ocorrencia enviada com sucesso!");

   }



}
