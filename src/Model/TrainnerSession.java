package Model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TrainnerSession {
    private int SesionId;
    private User user;
    private Time StartTime;
    private List<Challenge> challengesToDo;


    public TrainnerSession(User user){
        this.user = user;
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

    public  void ShowInfoUser(){
        User actualUser = this.user;
        String GetInformation = actualUser.toString();
        System.out.println(GetInformation);
    }

}
