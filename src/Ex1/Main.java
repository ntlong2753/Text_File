package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap duong dan file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);

        /* ...
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
        ... */
    }
}
