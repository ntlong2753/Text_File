package csvFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private int id;
    private String lane;
    private String name;
    private String email;
    private String phone;
    private String dateOfBirth;

    public Student() {

    }
    public Student(int id, String lane, String name, String email, String phone, String dateOfBirth) {
        this.id = id;
        this.lane = lane;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getLane() {
        return lane;
    }
    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", lane = '" + lane + '\'' +
                "; name = '" + name + '\'' +
                "; email = '" + email + '\'' +
                "; phone = '" + phone + '\'' +
                "; dateOfBirth = '" + dateOfBirth + '\'' +
                "; age = '" + getAge() + '\'' +
                '}';
    }

    public int getAge() {
        /* ...
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(this.dateOfBirth.trim(), formatter);
        return currentDate.getYear() - birthDate.getYear();
        ... */

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(this.dateOfBirth, formatter);
        return currentDate.getYear() - birthDate.getYear();
    }
}
