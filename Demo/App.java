import java.io.File;
import java.io.IOException ;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
        File myFile = new File("data/myFile.txt");
        System.out.println(myFile.exists());

        // 1. Tạo một đối tượng File đại diện cho một file đang tồn tại:
        File f = new File("foo.txt");

        // 2. Tạo một thư mục mới:
        File dir = new File("Book");
        dir.mkdir();

        // 3. Liệt kê nội dung của một thư mục:
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++){
                System.out.println(dirContents[i]);
                }
        }

        // 4. Lấy đường dẫn tuyệt đối của file hoặc thư mục:
        System.out.println(dir.getAbsolutePath());

        // 5. Xóa file hoặc thư mục (trả về true nếu thành công):
        boolean isDeleted = f.delete();

        // 6. Tự động đóng tài nguyên bằng cách sử dụng try-with-resources
        File file = new File("scores.txt");
        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith");
            output.println(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
