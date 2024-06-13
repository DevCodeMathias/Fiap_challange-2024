package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends User  {
    private String email;
    private List<Date>availableDates;


    public Teacher(String Name, String Position) {
        super(Name, Position);
        this.email = Name + "@LEPIC.COM.BR";


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Date> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<Date> availableDates) {
        this.availableDates = availableDates;
    }

    public boolean isDateAvailable(Date data) {
        return availableDates.contains(data);
    }

    public void removeAvailableDate(Date data){

        availableDates.remove(data);
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

