import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String pathStr = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path path = Path.of(pathStr);
        List<String> allLines = Files.readAllLines(path);

        allLines.stream().map(line -> line.toCharArray()).forEach();

        /*
        for (String line : allLines) {
            int sum = 0;
            for (int index = 0; index < line.length(); index++) {
                char curretSymbol = line.charAt(index);
                sum +=  curretSymbol;
            }
            System.out.println(sum);
        }

         */
    }
}
