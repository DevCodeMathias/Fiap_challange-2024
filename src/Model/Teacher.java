package Model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User  {
    private String email;

    private List<String> availableDates;

    public Teacher(String Name, String Position) {
        super(Name, Position);
        this.email = Name + "@LEPIC.COM.BR";
        this.availableDates = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDateAvailable(String date) {
        return availableDates.contains(date);
    }

    public void removeAvailableDate(String date) {
        availableDates.remove(date);
    }

    public List<String> getAvailableDates() {
        return availableDates;
    }
}

