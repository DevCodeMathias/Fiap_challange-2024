package Model;

import javax.naming.Name;
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
}
