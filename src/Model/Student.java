package Model;

import javax.naming.Name;
import java.util.Date;
import java.util.List;

public class Student extends User {
    private int Points;
    private String Certificate;
    private List<String> achievements;

    public Student(String Name, String Position, int Points) {
        super(Name, Position);
        this.Points = Points ;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int points) {
        Points = points;
    }

    @Override
    public String toString() {
        return
                "Student{" +
                        "Points=" + Points +
                        ", Name='" + super.getName() + '\'' +
                        '}';

    }

    public void onlineAppointment(String  RequestData, Teacher teacher) {

        if (teacher.isDateAvailable(RequestData)) {
            System.out.println(" A data " + RequestData + " esta disponivel e confirmada .");
            teacher.removeAvailableDate(RequestData);
        } else {
            System.out.println("a data  " + RequestData + " não esta disponive.");
        }
    }

    //adicionar na agenda do professor

}
