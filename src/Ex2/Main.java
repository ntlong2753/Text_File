package Ex2;

import java.util.List;
import java.util.Scanner;

import static Ex2.ReadAndWriteFile.findMax;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input file:");
        String input = sc.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(input);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }

}
