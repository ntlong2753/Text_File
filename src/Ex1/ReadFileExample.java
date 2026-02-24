package Ex1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String path) {
        try {
            File file = new File("data/myFile.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println(sum);
        }

        catch (Exception e) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }


}
