package Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File file = new File("data/number.txt");
        int sum;
        String line = "";
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            sum = 0;
                while ((line = br.readLine()) != null) {
                    try {
                        sum += Integer.parseInt(line.trim());
                        System.out.println(line);
                    } catch (NumberFormatException e) {
                        System.out.println("ko phai so: " + line);
                    }
                }
            System.out.println("" + sum);
        }
        catch (Exception e) {
            System.err.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }
}
