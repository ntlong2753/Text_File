package Ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line= br.readLine()) != null) {
                if(line.matches("\\d+")){
                    numbers.add(Integer.parseInt(line));
                    // thieu bo qua cac chu nen nhung file co ky tu khong se gay ra loi
                }else{
                    System.out.println("Skip :" +line);
                }

            }

        }
        catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        // dung for each thang ngu
        for (int num :numbers) {
            if (num >max) {
                max = num;
            }
        }
        return max;
    }
}
