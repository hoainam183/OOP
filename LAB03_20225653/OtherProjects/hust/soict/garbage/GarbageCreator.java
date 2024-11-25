import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GarbageCreator {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LENOVO\\Desktop\\OOP\\LAB03_20225653\\OtherProjects\\hust\\soict\\garbage\\text.txt";
        long startTime, endTime;
        try {
            startTime = System.currentTimeMillis();            
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            String outputFile = "";
            for (String line : lines) {
                outputFile += line;
            }

            endTime = System.currentTimeMillis();

            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
