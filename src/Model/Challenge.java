package Model;

import javax.xml.namespace.QName;
import java.util.List;

public class Challenge {
    private int ChallangeID;
    private String Nome;
    private String Description;
    private String DificultyLevel;
    private  Boolean IsComplet;

    public Challenge(String Name ,String Description, String DificultyLevel){
        this.Nome = Name;
        this.Description = Description;
        this.DificultyLevel = DificultyLevel;
        this.IsComplet = false;
    }

    public int getChallangeID() {
        return ChallangeID;
    }

    public void setChallangeID(int challangeID) {
        ChallangeID = challangeID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDificultyLevel() {
        return DificultyLevel;
    }

    public void setDificultyLevel(String dificultyLevel) {
        DificultyLevel = dificultyLevel;
    }

    public Boolean getComplet() {
        return IsComplet;
    }

    public void setComplet(Boolean complet) {
        IsComplet = complet;
    }

    public void AddToBoard(){
        //vaiadicionar no lista seção de treinamento
    }

    public void GetFeedback(){
        // se for completa vai retornar um feedback
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


    @Override
    public String toString() {
        return "Nome"+ Nome + "Descrição: " + Description + ", Nível de Dificuldade: " + DificultyLevel;
    }

}
