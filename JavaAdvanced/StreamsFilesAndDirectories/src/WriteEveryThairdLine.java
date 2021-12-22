import java.io.*;

public class WriteEveryThairdLine {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            int counter = 1;
            String line = in.readLine();
            while (line != null) {
                if (counter % 3 == 0) {
                    out.println(line);
                }
                counter++;
                line = in.readLine();
            }
        }
    }
}
