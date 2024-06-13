package Model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String email;
    private List<String> availableDates;

    public Teacher(String name, String position, List<String> dates) {
        super(name, position);
        this.email = name + "@LEPIC.COM.BR";
        this.availableDates = dates;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<String> availableDates) {
        this.availableDates = availableDates;
    }

    public boolean isDateAvailable(String date) {
        return availableDates.contains(date);
    }

    public void removeAvailableDate(String date) {
        availableDates.remove(date);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + getName() +
                ", email=" + email +
                ", availableDates=" + availableDates +
                '}';
    }
}
