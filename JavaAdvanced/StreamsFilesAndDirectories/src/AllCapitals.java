import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        Files.readAllLines(Path.of(path)).forEach(str -> {
            try {
                writer.write(str.toUpperCase());
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
