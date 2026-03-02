package csvFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
    private final File myFile = new File("data/student.txt");
    public void showListStudent() {
        try {
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List<Student> students = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(",");
                Student std = new Student(Integer.parseInt( parts[0].trim()),
                                                            parts[1].trim(),
                                                            parts[2].trim(),
                                                            parts[3].trim(),
                                                            parts[4].trim(),
                                                            parts[5].trim());
                /*std.setId(Integer.parseInt(parts[0].trim()));
                std.setLane(parts[1].trim());
                std.setName(parts[2].trim());
                std.setEmail(parts[3].trim());
                std.setPhone(parts[4].trim());*/
                std.setDateOfBirth(parts[5].trim());
                students.add(std);
            }
            for (Student s : students) {
                System.out.println(s);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File khong ton tai");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Nhap thong tin------");

        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter lane: ");
        String lane = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter date of birth: ");
        String dateOfBirth = sc.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(myFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();

            String data = id + ", " + name + ", " + lane + ", " + email + ", " + phone + ", " + dateOfBirth;

            bufferedWriter.write(data);
            bufferedWriter.close();
        }
        catch (Exception e) {

        }
    }
}
