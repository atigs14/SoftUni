import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
            Write a program that:
        · Reads from console number of students for a track.
        · Reads on pair of rows:
            o First line is the name of student.
            o Second line is his score for different number of courses.
        · Print on console "{name} is graduated with {average scores)".
         */

        int rotations = Integer.parseInt(console.nextLine());

        Map<String, Double> mapScore = new TreeMap<>();

        for (int i = 0; i < rotations; i++) {
            String name = console.nextLine();
            double[] grades = Arrays.stream(console.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            double avgScore = 0;

            for (double grade : grades) {
                avgScore+= grade;
            }

            avgScore /= grades.length;

            mapScore.put(name, avgScore);
        }

        for (String name : mapScore.keySet()) {
            System.out.println(name + " is graduated with "  + mapScore.get(name));
        }
    }
}
