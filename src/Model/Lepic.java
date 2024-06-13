package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lepic  extends inventory{
    private String Adrees;
    private String email;
    private List<Teacher> teacherArrayList;

    //prototipando banco de ddados e o populando
    List<Teacher> teacherlIST  = new ArrayList<>(Arrays.asList(
            new Teacher("John Doe", "Teacher"),
            new Teacher("Jane Smith", "Teacher"),
            new Teacher("Emily Johnson", "Teacher")
    ));

    public Lepic() {
        this.teacherArrayList = teacherlIST;
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
