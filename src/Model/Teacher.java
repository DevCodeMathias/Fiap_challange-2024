package Model;

import java.util.List;

public class Teacher extends User  {
    private String email;
    private List<List> Classes;

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

    public List<List> getClasses() {
        return Classes;
    }

    public void setClasses(List<List> classes) {
        Classes = classes;
    }
}
