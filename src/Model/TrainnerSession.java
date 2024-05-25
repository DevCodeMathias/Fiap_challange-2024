package Model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//RESPONSÁVEL POR MOSTSRTA AS INFOS DO USER
//REPONSÁVEL POR MOSTRAR DESAFIOS FEITOS (TIPO UM HISTÓRICO)

public class TrainnerSession {
    private int SesionId;
    private User user;
    private List<Challenge> challengesCheck;


    public TrainnerSession(User user, List<Challenge> ChallangeForyou){
        this.user = user;
        this.challengesCheck = ChallangeForyou;
    }

    public int getSesionId() {
        return SesionId;
    }

    public void setSesionId(int sesionId) {
        SesionId = sesionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public  void ShowInfoUser(){
        User actualUser = this.user;
        String GetInformation = actualUser.toString();
        System.out.println(GetInformation);
    }

    public void showUserChallenges() {
        System.out.println("Desafios do usuário:");
        for (Challenge challenge :challengesCheck) {
            System.out.println(challenge);
        }
    }

}
