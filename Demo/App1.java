import java.io.File;

public class App1 {
    public static void main(String[] args) {
        File myFile = new File("Data/example.txt");
        System.out.println("file co ton tai hay khong: " + myFile.exists());
        System.out.println("file co the ghi du lieu hay khong: " + myFile.canWrite());
        System.out.println("file co the doc du lieu hay khong: " + myFile.canRead());
        System.out.println(myFile.canExecute());
    }
}
