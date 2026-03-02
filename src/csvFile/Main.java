package csvFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Danh sach chon-----");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Lay thong in sinh vien");
        System.out.println("3. Exit");
        System.out.println("Chon: ");
        int choice = sc.nextInt();
        StudentManage studentManage = new StudentManage();
        switch(choice) {
            case 1:
                studentManage.addStudent();
                break;
            case 2:
                studentManage.showListStudent();
                break;
        }
    }
}
