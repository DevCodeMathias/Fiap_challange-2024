package Model;

public class Lepic {
    private String Adrees;
    private String email;

   private  inventory inventory = new inventory();

    public Lepic() {
        //informações da instiuição
    }

    public  void bookMaterial( ){

      int available =  inventory.returnAvailable();
      if (available == 0){
          System.out.println("sem equipamentos disponiveis no momento");
          return ;
        }else {
          System.out.println("Equipamento reservado com sucesso");
          inventory.popMaterial();

      }
    }
}
