package Model;

import java.util.List;

public class Lepic  extends inventory{
    private String Adrees;
    private String email;
    private List<Teacher> Teacher;

    public Lepic() {
        //informações da instiuição
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



}
