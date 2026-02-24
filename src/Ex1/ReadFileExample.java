package Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String fileePath) {
        try {
            File file = new File(fileePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;

            while ((line = br.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line.trim());
                    System.out.println(line);
                } catch (NumberFormatException e) {
                    System.out.println(line + ": ko phai so");
                }
            }
            System.out.println(sum);
        }
        catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }
}
