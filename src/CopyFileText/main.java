package CopyFileText;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file hiện tại: ");
        String pathSource = sc.nextLine();
        System.out.println("Nhập đường dẫn file đích: ");
        String pathTarget = sc.nextLine();
        CopyFileText fileCopy = new CopyFileText();
        fileCopy.readFileText(pathSource, pathTarget);
    }
}
