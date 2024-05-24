package Model;

import java.sql.Time;
import java.util.List;

public class TrainnerSession {
    private int SesionId;
    private User user;
    private Time StartTime;
    private List<Challenge> challengesToDo;


    public TrainnerSession(){

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

    public Time getStartTime() {
        return StartTime;
    }

    public void setStartTime(Time startTime) {
        StartTime = startTime;
    }

    public void managerSession(Challenge challenge, boolean complete) {

    }

    public void InitTraining(){
        //iniciliza os treinamentos e atribui pontos aos usuários
    }


}
