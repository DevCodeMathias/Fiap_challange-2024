package Model;

import java.util.List;
import java.util.ArrayList;

public class Achievements {
    private List<String> certificates;
    private String nameAchievement;
    private String userName;

    public Achievements(User user, String nameOfAchievement) {
        this.userName = user.getName();
        this.nameAchievement = nameOfAchievement;
        this.certificates = new ArrayList<>();
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public String getNameAchievement() {
        return nameAchievement;
    }

    public void setNameAchievement(String nameAchievement) {
        this.nameAchievement = nameAchievement;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addCertificate(String certificate) {
        certificates.add(certificate);
    }

    @Override
    public String toString() {
        return "Achievements{" +
                "nameAchievement='" + nameAchievement + '\'' +
                ", userName='" + userName + '\'' +
                ", certificates=" + certificates +
                '}';
    }

    public void displayAchievementDetails() {
        System.out.println("Achievement: " + nameAchievement);
        System.out.println("User: " + userName);
        System.out.println("Certificates: ");
        for (String certificate : certificates) {
            System.out.println("- " + certificate);
        }
    }
}
