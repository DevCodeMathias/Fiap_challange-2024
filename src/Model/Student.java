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
   // Scanner scanner = new Scanner(System.in);
     //   System.out.println("Enter a date you would like to schedule the tutoring session (format DD/MM/YYYY): ");
    //String requestedDate = scanner.nextLine();

    public void onlineAppointment(String RequestData, Teacher teacher) {

        if (teacher.isDateAvailable(RequestData)) {
            System.out.println("The date " + RequestData + " is available. Appointment confirmed!");
            teacher.removeAvailableDate(RequestData);
        } else {
            System.out.println("The date " + RequestData + " is not available. Please try another date.");
        }
    }

}
