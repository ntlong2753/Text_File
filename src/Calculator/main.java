package Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
