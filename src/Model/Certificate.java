package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Certificate {
    private String name;
    private Date issueDate;

    public Certificate(String name, Date issueDate) {
        this.name = name;
        this.issueDate = issueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }


    public boolean isRecent() {
        long diffInMillies = Math.abs(new Date().getTime() - issueDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff <= 30;
    }

    public String getFormattedIssueDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(issueDate);
    }
}
