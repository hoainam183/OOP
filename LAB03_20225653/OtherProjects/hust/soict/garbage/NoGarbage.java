
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NoGarbage {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\LENOVO\\Desktop\\OOP\\LAB03_20225653\\OtherProjects\\hust\\soict\\garbage\\text.txt";
        long startTime, endTime;
        try {
            startTime = System.currentTimeMillis();
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            StringBuilder outputFile = new StringBuilder();
            for (String line : lines) {
                outputFile.append(line);
            }

            endTime = System.currentTimeMillis();

            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
