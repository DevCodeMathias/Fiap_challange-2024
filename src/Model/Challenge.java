package Model;

public class Challenge {
    private int ChallangeID;
    private String Description;
    private String DificultyLevel;
    private  Boolean IsComplet;

    public Challenge(String Description, String DificultyLevel){
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


}
