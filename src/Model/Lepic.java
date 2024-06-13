package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Lepic  extends inventory{
    private String Adrees;
    private String email;
    private List<Teacher> teacherArrayList;

    public Lepic(List<Teacher> teacherlist) {
        this.teacherArrayList = teacherlist;
    }

    public  void bookMaterial( ){

      int available =  returnAvailable();
      if (available == 0){
          System.out.println("sem equipamentos disponiveis no momento");
          return ;
        }else {
          System.out.println("Equipamento reservado com sucesso");
          popMaterial();

      }
    }

    public Teacher getFirstTeacher() {
        if (teacherArrayList!= null && !teacherArrayList.isEmpty()) {
            Teacher fisrtTeacher =  teacherArrayList.getFirst( );
            teacherArrayList.remove(0);
           return fisrtTeacher;
        } else {
            return null;
        }
    }


}
