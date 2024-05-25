package Model;

import javax.xml.namespace.QName;
import java.util.List;

public class Challenge {
    private int ChallangeID;
    private String Nome;
    private String Description;
    private String DificultyLevel;
    private  Boolean IsComplet;
    private int  Points;

    public Challenge( String Name ,String Description, String DificultyLevel, int Points){

        this.Nome = Name;
        this.Description = Description;
        this.DificultyLevel = DificultyLevel;
        this.IsComplet = false;
        this.Points = Points;
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

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int points) {
        Points = points;
    }

    public void completeChallenge(User user) {
        if (!IsComplet) {
            IsComplet = true;
            user.setPoints(user.getPoints() + this.Points);
            System.out.println("Desafio completo! " + Points + " pontos foram adicionados");
        } else {
            System.out.println("Desafio já foi completado.");
        }
    }


    @Override
    public String toString() {
        return "Nome"+ Nome + "Descrição: " + Description + ", Nível de Dificuldade: " + DificultyLevel;
    }

}
