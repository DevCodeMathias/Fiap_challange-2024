package Model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class TrainnerSession {
    private int SesionId;
    private Student user;
    private List<Challenge> challengesCheck;


    public TrainnerSession(Student user, List<Challenge> ChallangeForyou){
        this.user = user;
        this.challengesCheck = ChallangeForyou;
    }

    public int getSesionId() {
        return SesionId;
    }

    public void setSesionId(int sesionId) {
        SesionId = sesionId;
    }

    public Student getUser() {
        return user;
    }

    public void setUser(Student user) {
        this.user = user;
    }

    public  void ShowInfoUser(){
        Student actualUser = this.user;
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
