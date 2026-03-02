package Calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while((line = br.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line.trim());
                    System.out.println(line);
                }
                catch (NumberFormatException e) {
                    System.err.println(line + ": ko phai so");
                }
            }
            br.close();
            System.out.println("Tong = " + sum);
        }
        catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
