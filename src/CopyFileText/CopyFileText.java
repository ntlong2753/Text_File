package CopyFileText;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileText {
    public void readFileText(String pathSource , String pathTarget) {
        try {
            File fileSource = new File(pathSource);
            File fileTarget = new File(pathTarget);
            Path sourceFile = Paths.get(pathSource);
            Path targetFile = Paths.get(pathTarget);
            if(!fileSource.exists()) {
                throw new FileNotFoundException();
            }
            Scanner sc = new Scanner(System.in);
            if(fileTarget.exists()) {
                System.out.println("File đích đã tồn tại!");
                System.out.println("1 - Ghi đè");
                System.out.println("2 - Không ghi");
                System.out.print("Chọn: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
                } else {
                    System.out.println("Không copy");
                }
            } else {
                Files.copy(sourceFile, targetFile);
                System.out.println("Copy thành công");
            }
        }
        catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }
}
