import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathOne = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathTwo = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String output = "outputFor7";

        PrintWriter writer = new PrintWriter(output);
        Files.readAllLines(Path.of(pathOne)).forEach(writer::println);
        Files.readAllLines(Path.of(pathTwo)).forEach(writer::println);

        writer.close();
    }
}
