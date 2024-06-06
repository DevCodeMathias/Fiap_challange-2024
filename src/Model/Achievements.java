package Model;

import java.util.List;
import java.util.ArrayList;

public class Achievements {
    private List<String> certificates;


    public Achievements() {
        this.certificates = new ArrayList<>();
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }


    public void addCertificate(String certificate) {
        certificates.add(certificate);
    }

    public void displayAchievementDetails() {

        System.out.println("Certificates: ");
        for (String certificate : certificates)  {
            System.out.println("- " + certificate);
        }
    }
}
