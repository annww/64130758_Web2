package ntu.hongdta.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SinhVien {
    private String id;
    private String name;
    private LocalDate dob; 
    private String major;

    public SinhVien(String id, String name, String dob, String major) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.id = id;
        this.name = name;
        this.dob = LocalDate.parse(dob, formatter);
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
