import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFIle {
    public static void main(String[] args) {
        String inputpath = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\Siek\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try(InputStream in = new FileInputStream(inputpath);
            OutputStream out = new FileOutputStream(outputPath)){
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!symbols.contains((char)oneByte)) {
                    out.write(oneByte);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
